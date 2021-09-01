/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mayra
 */
@Entity
@Table(name = "consumo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consumo.findAll", query = "SELECT c FROM Consumo c"),
    @NamedQuery(name = "Consumo.findByIdConsumo", query = "SELECT c FROM Consumo c WHERE c.idConsumo = :idConsumo"),
    @NamedQuery(name = "Consumo.findByMac", query = "SELECT c FROM Consumo c WHERE c.mac = :mac"),
    @NamedQuery(name = "Consumo.findByObservacion", query = "SELECT c FROM Consumo c WHERE c.observacion = :observacion"),
    @NamedQuery(name = "Consumo.findByFecha", query = "SELECT c FROM Consumo c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Consumo.findByMedida", query = "SELECT c FROM Consumo c WHERE c.medida = :medida")})
public class Consumo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_consumo")
    private Short idConsumo;
    @Size(max = 300)
    @Column(name = "MAC")
    private String mac;
    @Size(max = 300)
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 300)
    @Column(name = "medida")
    private String medida;
    @JoinColumn(name = "id_dispositivo", referencedColumnName = "id_dispositivo")
    @ManyToOne
    private Dispositivo idDispositivo;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private Usuario idUsuario;

    public Consumo() {
    }

    public Consumo(Short idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Short getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Short idConsumo) {
        this.idConsumo = idConsumo;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public Dispositivo getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Dispositivo idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConsumo != null ? idConsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumo)) {
            return false;
        }
        Consumo other = (Consumo) object;
        if ((this.idConsumo == null && other.idConsumo != null) || (this.idConsumo != null && !this.idConsumo.equals(other.idConsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "webservices.Consumo[ idConsumo=" + idConsumo + " ]";
    }
    
}
