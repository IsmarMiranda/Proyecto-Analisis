/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import url.modulo.controladoresBD.Detallefactura;

/**
 *
 * @author carlo
 */
public class CrearDetalle {
    
    private Detallefactura detalle;

    public CrearDetalle() {
        this.detalle = new Detallefactura();
    }
    
    public void detalle(TableModel modeloProducto,int seleccion,double cantidad,int idFactura){
        
        detalle.setCantidad(cantidad);
        detalle.setCodigo(modeloProducto.getValueAt(seleccion,1).toString());
        detalle.setDescripcion(modeloProducto.getValueAt(seleccion,2).toString());
        detalle.setTotal((double)modeloProducto.getValueAt(seleccion,3));
        detalle.setFacturaID(idFactura);
    }
    
    public Detallefactura obtenerDetalle(){
        return this.detalle;
    }
    
    
}
