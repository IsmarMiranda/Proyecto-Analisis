/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Usuarios;

/**
 *
 * @author carlo
 */
public class MostrarUsuarios {
    
    public MostrarUsuarios(){
        
    }
    
    public List<String> obtenerUsuarios(EntityManager em){
        
        TypedQuery query = em.createNamedQuery("Usuarios.findByNombreUsuario",Usuarios.class);
        List<String> usuarios = query.getResultList();
        return usuarios;
    }
    
}
