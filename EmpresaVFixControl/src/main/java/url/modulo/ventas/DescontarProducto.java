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
public class DescontarProducto {
    
    private Producto producto ;
    
    public DescontarProducto(){
        this.producto= new Producto();
    }
    
    public Producto actualizar(TableModel modeloInventario,int seleccion,int cantidad){
        
        producto.setCodigo(modeloInventario.getValueAt(seleccion,0).toString());
        producto.setCategoriaprdID((int)modeloInventario.getValueAt(seleccion,1));
        producto.setNombre(modeloInventario.getValueAt(seleccion,2).toString());
        producto.setExistencia((int)modeloInventario.getValueAt(seleccion,3)-cantidad);
        producto.setColor(modeloInventario.getValueAt(seleccion,4).toString());
        producto.setModelo(modeloInventario.getValueAt(seleccion,5).toString());
        producto.setMarca(modeloInventario.getValueAt(seleccion,6).toString());
        producto.setTipo(modeloInventario.getValueAt(seleccion,7).toString());
        producto.setPrecio((double)modeloInventario.getValueAt(seleccion,8));
        producto.setDescripcion(modeloInventario.getValueAt(seleccion,9).toString());
        return this.producto;
    }
}
