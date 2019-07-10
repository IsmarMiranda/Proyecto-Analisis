/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.List;
import url.modulo.controladoresBD.Detallefactura;

/**
 *
 * @author carlo
 */
public class DetallesDeFactura implements ColeccionDeProductos{

    private List<Detallefactura> detalle;
    private double total=0;
    
    public DetallesDeFactura(List<Detallefactura> detalle){
        this.detalle=detalle;
    }
    
    @Override
    public double tota() {
        for (Detallefactura detallefactura : detalle) {
            total = total + detallefactura.getTotal();
        }
        return  this.total;
    }
    
    public void quitarProducto(String codigo){
        detalle.stream().filter((detallefactura) -> (detallefactura.getCodigo().equals(codigo))).forEachOrdered((detallefactura) -> {
            detalle.remove(detallefactura);
        });
    }
    
}
