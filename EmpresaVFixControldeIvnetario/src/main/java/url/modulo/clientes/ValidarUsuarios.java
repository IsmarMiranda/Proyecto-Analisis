/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import url.modulo.controladoresBD.Usuarios;

/**
 *
 * @author carlo
 */
public class ValidarUsuarios implements ValidarUsuario{

    @Override
    public boolean validar(String nombre, EntityManager em) {
       TypedQuery query = em.createNamedQuery("Usuarios.findByNombre",Usuarios.class);  
       query.setParameter("nombre",nombre);
       List<Usuarios> usuario= query.getResultList();
       
        for (Usuarios u : usuario) {
            if(u.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }
    
}
