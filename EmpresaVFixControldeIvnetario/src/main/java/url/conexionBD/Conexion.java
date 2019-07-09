/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.conexionBD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carlo
 */
public class Conexion {

    private static EntityManager em;
    private static EntityManagerFactory emf;
    
    private Conexion() { }

    public static synchronized EntityManager obtenerConexion(){
    
        if(Conexion.em==null){
            
            Conexion.emf=Persistence.createEntityManagerFactory("vfix");
            Conexion.em = emf.createEntityManager();
        }
        return em;
    }
    
    
    
}
