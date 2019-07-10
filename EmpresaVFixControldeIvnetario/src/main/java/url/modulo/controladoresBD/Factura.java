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
@Table(name = "factura")
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f"),
    @NamedQuery(name = "Factura.findByIdFactura", query = "SELECT f FROM Factura f WHERE f.idFactura = :idFactura"),
    @NamedQuery(name = "Factura.findByNombre", query = "SELECT f FROM Factura f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Factura.findByDireccion", query = "SELECT f FROM Factura f WHERE f.direccion = :direccion"),
    @NamedQuery(name = "Factura.findByNit", query = "SELECT f FROM Factura f WHERE f.nit = :nit"),
    @NamedQuery(name = "Factura.findByTotal", query = "SELECT f FROM Factura f WHERE f.total = :total"),
    @NamedQuery(name = "Factura.findByDescuento", query = "SELECT f FROM Factura f WHERE f.descuento = :descuento"),
    @NamedQuery(name = "Factura.findByVenta", query = "SELECT f FROM Factura f WHERE f.venta = :venta"),
    @NamedQuery(name = "Factura.findByGarantia", query = "SELECT f FROM Factura f WHERE f.garantia = :garantia"),
    @NamedQuery(name = "Factura.findByEfectivo", query = "SELECT f FROM Factura f WHERE f.efectivo = :efectivo"),
    @NamedQuery(name = "Factura.findByTarjeta", query = "SELECT f FROM Factura f WHERE f.tarjeta = :tarjeta"),
    @NamedQuery(name = "Factura.findByFecha", query = "SELECT f FROM Factura f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "Factura.findByEliminado", query = "SELECT f FROM Factura f WHERE f.eliminado = :eliminado"),
    @NamedQuery(name = "Factura.findUltimaFactura", query = "SELECT MAX(f.idFactura) FROM Factura f "),
    @NamedQuery(name = "Factura.findByUsuariosId", query = "SELECT f FROM Factura f WHERE f.usuariosId = :usuariosId")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFactura")
    private Integer idFactura;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "nit")
    private String nit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "venta")
    private Short venta;
    @Column(name = "garantia")
    private Short garantia;
    @Column(name = "efectivo")
    private Short efectivo;
    @Column(name = "tarjeta")
    private Short tarjeta;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "eliminado")
    private Short eliminado;
    @Basic(optional = false)
    @Column(name = "usuarios_id")
    private int usuariosId;

    public Factura() {
    }

    public Factura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Factura(Integer idFactura, int usuariosId) {
        this.idFactura = idFactura;
        this.usuariosId = usuariosId;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Short getVenta() {
        return venta;
    }

    public void setVenta(Short venta) {
        this.venta = venta;
    }

    public Short getGarantia() {
        return garantia;
    }

    public void setGarantia(Short garantia) {
        this.garantia = garantia;
    }

    public Short getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Short efectivo) {
        this.efectivo = efectivo;
    }

    public Short getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Short tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getEliminado() {
        return eliminado;
    }

    public void setEliminado(Short eliminado) {
        this.eliminado = eliminado;
    }

    public int getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(int usuariosId) {
        this.usuariosId = usuariosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "url.modulo.controladoresBD.Factura[ idFactura=" + idFactura + " ]";
    }
    
}
