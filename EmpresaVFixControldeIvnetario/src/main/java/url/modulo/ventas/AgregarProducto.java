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
    
    public Producto actualizar(TableModel modelo,int seleccion,int cantidad){
        
        producto.setCodigo(modelo.getValueAt(seleccion,0).toString());
        producto.setNombre(modelo.getValueAt(seleccion,2).toString());
        producto.setExistencia((int)modelo.getValueAt(seleccion,3)+cantidad);
        producto.setColor(modelo.getValueAt(seleccion,4).toString());
        producto.setModelo(modelo.getValueAt(seleccion,5).toString());
        producto.setMarca(modelo.getValueAt(seleccion,6).toString());
        producto.setTipo(modelo.getValueAt(seleccion,7).toString());
        producto.setPrecio((double)modelo.getValueAt(seleccion,8));
        producto.setDescripcion(modelo.getValueAt(seleccion,9).toString());
        return this.producto;
    }
}
