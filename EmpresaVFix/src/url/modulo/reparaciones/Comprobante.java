/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.reparaciones;

/**
 *
 * @author carlo
 */
public class Comprobante {
    
    private String nombreCliente;
    private String marcaTelefono;
    private String servicioTecnico;
    private String descripcionReparacion;
    private String imeiTerminal;
    private String telefono;
    private String modelo;
    private String fecha;
    private double precioReparacion;

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setMarcaTelefono(String marcaTelefono) {
        this.marcaTelefono = marcaTelefono;
    }

    public void setServicioTecnico(String servicioTecnico) {
        this.servicioTecnico = servicioTecnico;
    }

    public void setDescripcionReparacion(String descripcionReparacion) {
        this.descripcionReparacion = descripcionReparacion;
    }

    public void setImeiTerminal(String imeiTerminal) {
        this.imeiTerminal = imeiTerminal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrecioReparacion(double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getMarcaTelefono() {
        return marcaTelefono;
    }

    public String getServicioTecnico() {
        return servicioTecnico;
    }

    public String getDescripcionReparacion() {
        return descripcionReparacion;
    }

    public String getImeiTerminal() {
        return imeiTerminal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPrecioReparacion() {
        return precioReparacion;
    }
    
    
    
}
