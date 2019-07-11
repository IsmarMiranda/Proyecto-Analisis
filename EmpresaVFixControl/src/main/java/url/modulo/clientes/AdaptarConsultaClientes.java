/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import url.modulo.controladoresBD.Clientes;
import url.modulo.inventario.AdaptarConsulta;

/**
 *
 * @author carlo
 */
public class AdaptarConsultaClientes implements AdaptarConsulta{

    private DefaultTableModel modelo;
    private List<Clientes> cliente;
    
    public AdaptarConsultaClientes(List<Clientes> cliente){
       
        this.cliente=cliente;
    } 
            
    @Override
    public DefaultTableModel obtenerModelo() {
        
        String[] colummnas = {"Codigo","Nombre","Telefono","Cumpleaños","Estrellas","Correo"};
         this.modelo=new DefaultTableModel(colummnas,0);
        
        Object[] datos = new Object[6];
        
        for (Clientes c:this.cliente) {
            
            datos[0] = c.getCodigo();
            datos[1] = c.getNombre();
            datos[2] = c.getTelefono();
            datos[3] = c.getCumpleanios();
            datos[4] = c.getEstrellas();
            datos[5] = c.getCorreo();
            modelo.addRow(datos);
            
        }
        return this.modelo; 
    }
    
}
