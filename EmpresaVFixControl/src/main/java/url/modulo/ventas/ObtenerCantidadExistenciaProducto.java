/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class ObtenerCantidadExistenciaProducto {
    
    private int existencia;
    
    public ObtenerCantidadExistenciaProducto(EntityManager em,String codigo){
        
        TypedQuery query = em.createNamedQuery("Producto.findByCodigo",Producto.class);
        query.setParameter("codigo",codigo);
        List<Producto> resultado = query.getResultList();
        
        for (Producto s : resultado) {
            if(s.equals(codigo)){
                this.existencia=s.getExistencia();
                break;
            }
        } 
    }
    
    public int getExistencia(){
        return this.existencia;
    }
    
}
