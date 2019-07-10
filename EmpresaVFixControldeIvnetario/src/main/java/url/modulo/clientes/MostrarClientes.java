/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.table.DefaultTableModel;
import url.conexionBD.Conexion;
import url.modulo.controladoresBD.Clientes;



/**
 *
 * @author carlo
 */
public class MostrarClientes {
    
    private DefaultTableModel modelo;
    private EntityManager em;
    
    public void MostrarClientes(){
        
        this.modelo = new DefaultTableModel();
        this.em = Conexion.obtenerConexion();
    }
    
    public DefaultTableModel listaClientes(){
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Fecha Nacimiento");
        
        TypedQuery query = em.createNamedQuery("Clientes.findAll",Clientes.class);
        List<Clientes> resultado = query.getResultList();
        
        for (Clientes clientes : resultado) {
           
        }
        return null;
    }
    
}
