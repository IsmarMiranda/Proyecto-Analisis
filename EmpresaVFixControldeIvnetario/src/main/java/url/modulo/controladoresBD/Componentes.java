/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package url.modulo.controladoresBD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author carlo
 */
@Entity
@Table(name = "componentes")
@NamedQueries({
    @NamedQuery(name = "Componentes.findAll", query = "SELECT c FROM Componentes c"),
    @NamedQuery(name = "Componentes.findByIdComponente", query = "SELECT c FROM Componentes c WHERE c.idComponente = :idComponente"),
    @NamedQuery(name = "Componentes.findByProductoId", query = "SELECT c FROM Componentes c WHERE c.productoId = :productoId"),
    @NamedQuery(name = "Componentes.findByReparacionesId", query = "SELECT c FROM Componentes c WHERE c.reparacionesId = :reparacionesId")})
public class Componentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idComponente")
    private Integer idComponente;
    @Basic(optional = false)
    @Column(name = "producto_id")
    private int productoId;
    @Basic(optional = false)
    @Column(name = "reparaciones_id")
    private int reparacionesId;

    public Componentes() {
    }

    public Componentes(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Componentes(Integer idComponente, int productoId, int reparacionesId) {
        this.idComponente = idComponente;
        this.productoId = productoId;
        this.reparacionesId = reparacionesId;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getReparacionesId() {
        return reparacionesId;
    }

    public void setReparacionesId(int reparacionesId) {
        this.reparacionesId = reparacionesId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComponente != null ? idComponente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Componentes)) {
            return false;
        }
        Componentes other = (Componentes) object;
        if ((this.idComponente == null && other.idComponente != null) || (this.idComponente != null && !this.idComponente.equals(other.idComponente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "url.modulo.controladoresBD.Componentes[ idComponente=" + idComponente + " ]";
    }
    
}
