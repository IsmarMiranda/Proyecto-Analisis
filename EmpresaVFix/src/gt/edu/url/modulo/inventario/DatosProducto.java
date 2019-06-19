/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.modulo.inventario;

/**
 *
 * @author carlo
 */
public class DatosProducto {
    
    private String codigo;
    private String nombre;
    private String color;
    private String modelo;
    private String marca;
    private String tipo;
    private String descripcion;
    private int existencia;
    private double costo;
    private double PrecioMayoreo;
    private double PrecioCliente;
    private String imagen;
    private int categoria;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPrecioMayoreo(double PrecioMayoreo) {
        this.PrecioMayoreo = PrecioMayoreo;
    }

    public void setPrecioCliente(double PrecioCliente) {
        this.PrecioCliente = PrecioCliente;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecioMayoreo() {
        return PrecioMayoreo;
    }

    public double getPrecioCliente() {
        return PrecioCliente;
    }

    public String getImagen() {
        return imagen;
    }

    public int getCategoria() {
        return categoria;
    }
    
}
