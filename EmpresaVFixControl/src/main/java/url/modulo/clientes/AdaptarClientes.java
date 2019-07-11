/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.clientes;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author carlo
 */
public class AdaptarClientes {
    
    private DefaultComboBoxModel modelo;
    private String[] datos;
    
    public AdaptarClientes(){
        
    }
    
    public void obtenerLista(List<String> lista) {
        datos = new String[lista.size()];
        datos =lista.toArray(datos);
        modelo= new DefaultComboBoxModel(datos);
        
    }
    
    public DefaultComboBoxModel getModelo(){
        return this.modelo;
    }
}
