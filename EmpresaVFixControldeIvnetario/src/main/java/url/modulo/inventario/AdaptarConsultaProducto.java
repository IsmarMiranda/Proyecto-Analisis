/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class AdaptarConsultaProducto implements AdaptarConsulta{
    
    private DefaultTableModel modeloProductos;
    private List<Producto> productos;
    
    
    public AdaptarConsultaProducto(List<Producto> productos){
        this.productos=productos;
    }

    @Override
    public DefaultTableModel obtenerModelo() {
        
        String[] columnas = {"Codigo","Categoria","Nombre","Existencia","Color","Modelo","Marca","Tipo","Precio","Precio May","Precio Clint","Descripcion"}; 
        this.modeloProductos = new DefaultTableModel(columnas,0);
        
        Object[] producto = new Object[12];
        
        for (Producto p : this.productos) {
            
            producto[0]= p.getCodigo();
            producto[1]= p.getCategoriaprdID();
            producto[2]= p.getNombre();
            producto[3]= p.getExistencia();
            producto[4]= p.getColor();
            producto[5]= p.getModelo();
            producto[6]= p.getMarca();
            producto[7]= p.getTipo();
            producto[8]= p.getPrecio();
            producto[9]= p.getPrecioMayorista();
            producto[10]= p.getPrecioCliente();
            producto[11]=p.getDescripcion();
            
            modeloProductos.addRow(producto);
        }
        return this.modeloProductos;
    }
    
}
