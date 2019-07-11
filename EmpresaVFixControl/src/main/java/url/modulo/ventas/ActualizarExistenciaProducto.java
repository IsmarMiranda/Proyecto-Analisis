/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import url.controladores.ProductoJpaController;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class ActualizarExistenciaProducto {
    
    private ProductoJpaController control;
    
    public ActualizarExistenciaProducto(EntityManager em){
        this.control=new ProductoJpaController(em);
    }
    
    public void actualizarExistencia(Producto producto){
        try {
            control.actualizarExistencia(producto);
        } catch (Exception ex) {
            Logger.getLogger(ActualizarExistenciaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
