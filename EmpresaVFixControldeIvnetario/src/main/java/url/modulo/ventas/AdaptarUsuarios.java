/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author carlo
 */
public class AdaptarUsuarios {
    
    
    private DefaultComboBoxModel modelo;
    private String[] datos;
    
    
    public void obtenerLista(List<String> lista) {
        datos = new String[lista.size()];
        datos =lista.toArray(datos);
        modelo= new DefaultComboBoxModel(datos);
        
    }
    public DefaultComboBoxModel getModelo(){
        return this.modelo;
    }
    
}
