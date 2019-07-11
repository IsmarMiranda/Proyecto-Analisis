/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Categoria;

/**
 *
 * @author carlo
 */
public class obtenerIdCategoria {
    
    private String categoria;
    private int id;
    
    public obtenerIdCategoria(String categoria){
        this.categoria=categoria;
    }
    
    public void buscarId(EntityManager em){
        TypedQuery query = em.createNamedQuery("Categoria.findByNombre",Categoria.class);
        query.setParameter("nombre",categoria);
        List<Categoria> categorias = query.getResultList();
        
        for (Categoria cat: categorias) {
            if(cat.getNombre().equals(this.categoria)){
                this.id=cat.getIdCategoria();
                break;
            }
        }
        
    }
    
    public int obtenerId(){
        return this.id;
    }
}
