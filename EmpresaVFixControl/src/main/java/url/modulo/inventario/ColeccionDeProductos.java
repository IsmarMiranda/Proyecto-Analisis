/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.inventario;

import java.util.List;
import url.modulo.controladoresBD.Producto;

/**
 *
 * @author carlo
 */
public class ColeccionDeProductos implements IteradorDeProductos{

    private List<Producto> productos;
    private double total=0;
    
    public ColeccionDeProductos(List<Producto> producto){
        this.productos=producto;
    }
    

    @Override
    public double obtenerTotal() {
       return this.total;
    } 

    @Override
    public void calcularTotal() {
        
        for (Producto p : this.productos) {
            total=total+p.getPrecio();
        }
        
        
    }
}
