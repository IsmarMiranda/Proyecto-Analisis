/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.controladoresBD;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "reparaciones")
@NamedQueries({
    @NamedQuery(name = "Reparaciones.findAll", query = "SELECT r FROM Reparaciones r"),
    @NamedQuery(name = "Reparaciones.findByIdReparacion", query = "SELECT r FROM Reparaciones r WHERE r.idReparacion = :idReparacion"),
    @NamedQuery(name = "Reparaciones.findByNombre", query = "SELECT r FROM Reparaciones r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reparaciones.findByMarca", query = "SELECT r FROM Reparaciones r WHERE r.marca = :marca"),
    @NamedQuery(name = "Reparaciones.findByServicio", query = "SELECT r FROM Reparaciones r WHERE r.servicio = :servicio"),
    @NamedQuery(name = "Reparaciones.findByDescripcion", query = "SELECT r FROM Reparaciones r WHERE r.descripcion = :descripcion"),
    @NamedQuery(name = "Reparaciones.findByImei", query = "SELECT r FROM Reparaciones r WHERE r.imei = :imei"),
    @NamedQuery(name = "Reparaciones.findByBateria", query = "SELECT r FROM Reparaciones r WHERE r.bateria = :bateria"),
    @NamedQuery(name = "Reparaciones.findByCargador", query = "SELECT r FROM Reparaciones r WHERE r.cargador = :cargador"),
    @NamedQuery(name = "Reparaciones.findBySim", query = "SELECT r FROM Reparaciones r WHERE r.sim = :sim"),
    @NamedQuery(name = "Reparaciones.findByMicro", query = "SELECT r FROM Reparaciones r WHERE r.micro = :micro"),
    @NamedQuery(name = "Reparaciones.findByFecha", query = "SELECT r FROM Reparaciones r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Reparaciones.findByAccesorios", query = "SELECT r FROM Reparaciones r WHERE r.accesorios = :accesorios"),
    @NamedQuery(name = "Reparaciones.findByPrecio", query = "SELECT r FROM Reparaciones r WHERE r.precio = :precio")})
public class Reparaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReparacion")
    private Integer idReparacion;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "marca")
    private String marca;
    @Column(name = "servicio")
    private String servicio;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "imei")
    private String imei;
    @Column(name = "bateria")
    private Short bateria;
    @Column(name = "cargador")
    private Short cargador;
    @Column(name = "sim")
    private Short sim;
    @Column(name = "micro")
    private Short micro;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "accesorios")
    private String accesorios;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;

    public Reparaciones() {
    }

    public Reparaciones(Integer idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Integer getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(Integer idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Short getBateria() {
        return bateria;
    }

    public void setBateria(Short bateria) {
        this.bateria = bateria;
    }

    public Short getCargador() {
        return cargador;
    }

    public void setCargador(Short cargador) {
        this.cargador = cargador;
    }

    public Short getSim() {
        return sim;
    }

    public void setSim(Short sim) {
        this.sim = sim;
    }

    public Short getMicro() {
        return micro;
    }

    public void setMicro(Short micro) {
        this.micro = micro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReparacion != null ? idReparacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reparaciones)) {
            return false;
        }
        Reparaciones other = (Reparaciones) object;
        if ((this.idReparacion == null && other.idReparacion != null) || (this.idReparacion != null && !this.idReparacion.equals(other.idReparacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "url.modulo.controladoresBD.Reparaciones[ idReparacion=" + idReparacion + " ]";
    }
    
}
