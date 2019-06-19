/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.modulo.reparacion;

/**
 *
 * @author carlo
 */
public class Componente {
    
   private String nombreComponente;
   private int cantidad;
   private double precio;

    public Componente(String nombreComponente, int cantidad, double precio) {
        this.nombreComponente = nombreComponente;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreComponente() {
        return nombreComponente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
   
   
    
}
