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
import url.modulo.controladoresBD.Reparaciones;

/**
 *
 * @author carlo
 */
public class ReparacionesJpaController implements Serializable {

    public ReparacionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reparaciones reparaciones) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(reparaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reparaciones reparaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            reparaciones = em.merge(reparaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = reparaciones.getIdReparacion();
                if (findReparaciones(id) == null) {
                    throw new NonexistentEntityException("The reparaciones with id " + id + " no longer exists.");
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
            Reparaciones reparaciones;
            try {
                reparaciones = em.getReference(Reparaciones.class, id);
                reparaciones.getIdReparacion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reparaciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(reparaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reparaciones> findReparacionesEntities() {
        return findReparacionesEntities(true, -1, -1);
    }

    public List<Reparaciones> findReparacionesEntities(int maxResults, int firstResult) {
        return findReparacionesEntities(false, maxResults, firstResult);
    }

    private List<Reparaciones> findReparacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reparaciones.class));
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

    public Reparaciones findReparaciones(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reparaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getReparacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reparaciones> rt = cq.from(Reparaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
