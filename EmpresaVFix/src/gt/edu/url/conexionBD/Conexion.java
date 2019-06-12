/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.conexionBD;

/**
 *
 * @author carlo
 */
public class Conexion {
    
    private String baseDatos;
    private String usuario;
    private String contrasena;
    private static Conexion conexion;
    
    private Conexion(){
        
    }
    
    public static synchronized Conexion getInstancia(){
        
        if (conexion == null) {
            conexion = new Conexion();
        }
        return conexion;
    }
    
    public void obtenerDatosConexion(){
        
    }
}
