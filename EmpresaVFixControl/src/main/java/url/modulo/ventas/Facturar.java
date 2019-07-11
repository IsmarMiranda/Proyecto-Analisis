/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.ventas;

import java.util.ArrayList;
import java.util.List;

import url.modulo.controladoresBD.Detallefactura;
import url.modulo.inventario.IteradorDeProductos;

/**
 *
 * @author carlo
 */
public class Facturar implements IteradorDeProductos{
    
    private List<Detallefactura> detalles ;
    private double total=0;
    private double descuento=0;
    
    public Facturar(){
        this.detalles= new ArrayList<>();
    }

    @Override
    public void calcularTotal() {
        for (Detallefactura detalle : this.detalles) {
            total=0;
            total=total+detalle.getTotal();
        }
        
       
    }
    
    public void agregarDetalle(Detallefactura detalle){
        this.detalles.add(detalle);
    }
    
    public void removerDetalle(String codigo){
        
        for (Detallefactura detalle : this.detalles) {
            
            if(detalle.getCodigo().equals(codigo)){
                detalles.remove(detalle);
                break;
            }
        }
    }
    
    public List<Detallefactura> getDetalles(){
        return this.detalles;
    }
    
     public void descuento(double descuento){
        
        this.total=this.total-descuento;
        this.descuento=descuento;
    }
     
    public double obtenerTotal(){
        return this.total;
    }
    
    public double getDescuemto(){
        return this.descuento;
    }
    
}
