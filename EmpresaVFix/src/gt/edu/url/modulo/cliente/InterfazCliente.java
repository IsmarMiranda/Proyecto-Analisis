/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.modulo.cliente;

import gt.edu.url.conexionBD.Conexion;

/**
 *
 * @author carlo
 */
public interface InterfazCliente {
 
   public void operacionClientes(DatosCliente datosCliente, Conexion conexion);
    
}
