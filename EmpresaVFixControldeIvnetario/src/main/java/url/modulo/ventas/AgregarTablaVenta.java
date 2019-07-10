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
public class AgregarTablaVenta implements AgregaraVenta{
    
    public AgregarTablaVenta(){}

    @Override
    public DefaultTableModel obtenerModelo(TableModel modeloProducto, DefaultTableModel modeloDetalle, int seleccion, double cantidad) {
       
       Object[] datos = new Object[12];
       
       datos[0] = cantidad;
       datos[1] = modeloProducto.getValueAt(seleccion,0);
       datos[2] = modeloProducto.getValueAt(seleccion,1);
       datos[3] = modeloProducto.getValueAt(seleccion,2);
       datos[4] = modeloProducto.getValueAt(seleccion,3);
       datos[5] = modeloProducto.getValueAt(seleccion,4);
       datos[6] = modeloProducto.getValueAt(seleccion,5);
       datos[7] = modeloProducto.getValueAt(seleccion,6);
       datos[8] = modeloProducto.getValueAt(seleccion,7);
       datos[9] = modeloProducto.getValueAt(seleccion,8);
       datos[10] = modeloProducto.getValueAt(seleccion,9);
       datos[11] = cantidad * (double)modeloProducto.getValueAt(seleccion,8);
       modeloDetalle.addRow(datos);
       return  modeloDetalle;
       
    }
    
}
