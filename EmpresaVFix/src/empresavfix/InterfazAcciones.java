/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresavfix;

import gt.edu.url.conexionBD.Conexion;
import gt.edu.url.modulo.inventario.DatosProducto;

/**
 *
 * @author IsmarMiranda
 */
public interface InterfazAcciones {
    
   public void operacion(Conexion conexion, String codigo);
   
}
