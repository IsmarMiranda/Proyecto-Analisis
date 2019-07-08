/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.controladores;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import url.modulo.controladores.exceptions.NonexistentEntityException;
import url.modulo.controladoresBD.Componentes;

/**
 *
 * @author carlo
 */
public class ComponentesJpaController implements Serializable {

    public ComponentesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Componentes componentes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(componentes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Componentes componentes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            componentes = em.merge(componentes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = componentes.getIdComponente();
                if (findComponentes(id) == null) {
                    throw new NonexistentEntityException("The componentes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Componentes componentes;
            try {
                componentes = em.getReference(Componentes.class, id);
                componentes.getIdComponente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The componentes with id " + id + " no longer exists.", enfe);
            }
            em.remove(componentes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Componentes> findComponentesEntities() {
        return findComponentesEntities(true, -1, -1);
    }

    public List<Componentes> findComponentesEntities(int maxResults, int firstResult) {
        return findComponentesEntities(false, maxResults, firstResult);
    }

    private List<Componentes> findComponentesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Componentes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Componentes findComponentes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Componentes.class, id);
        } finally {
            em.close();
        }
    }

    public int getComponentesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Componentes> rt = cq.from(Componentes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
