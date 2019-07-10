/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import url.modulo.controladoresBD.Detallefactura;

/**
 *
 * @author carlo
 */
public class AgregarDetalles {
    
    private List<Detallefactura> detalles;
        
    
    public void AgregarDetalles(){
        
    }
    
    public void agregarDetalle(DefaultTableModel modelo,int idFactura){
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            
            Detallefactura detalle = new Detallefactura();
            detalle.setCantidad((double)modelo.getValueAt(i,0));
            detalle.setCodigo(modelo.getValueAt(i, 1).toString());
            detalle.setDescripcion(modelo.getValueAt(i, 2).toString());
            detalle.setTotal((double)modelo.getValueAt(i, 3));
            detalle.setFacturaID(idFactura);
        }        
    }
    
    public DetallesDeFactura obtenerDetalles(){
        return new DetallesDeFactura(this.detalles);
    }
}
