/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public interface Busqueda {
    
    public DefaultTableModel ResultadoBusqueda(FiltroBusqueda filtro);
}
