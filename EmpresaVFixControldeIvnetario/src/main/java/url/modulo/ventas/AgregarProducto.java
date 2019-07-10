/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import javax.swing.table.TableModel;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class AgregarProducto {
    
    private Producto producto ;
    
    public AgregarProducto(){
        this.producto=new Producto();
    }
    
    public Producto actualizar(TableModel modeloFactura,int seleccion,int cantidad){
        
        producto.setCodigo(modeloFactura.getValueAt(seleccion,1).toString());
        producto.setCategoriaprdID((int)modeloFactura.getValueAt(seleccion,2));
        producto.setNombre(modeloFactura.getValueAt(seleccion,3).toString());
        producto.setExistencia((int)modeloFactura.getValueAt(seleccion,4)+cantidad);
        producto.setColor(modeloFactura.getValueAt(seleccion,5).toString());
        producto.setModelo(modeloFactura.getValueAt(seleccion,6).toString());
        producto.setMarca(modeloFactura.getValueAt(seleccion,7).toString());
        producto.setTipo(modeloFactura.getValueAt(seleccion,8).toString());
        producto.setPrecio((double)modeloFactura.getValueAt(seleccion,9));
        producto.setDescripcion(modeloFactura.getValueAt(seleccion,10).toString());
        return this.producto;
    }
}
