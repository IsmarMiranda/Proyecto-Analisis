/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author carlo
 */
public interface AgregaraVenta {
 
    public DefaultTableModel obtenerModelo(TableModel modeloProducto,DefaultTableModel modeloDetalle,int seleccion,double cantidad);
}
