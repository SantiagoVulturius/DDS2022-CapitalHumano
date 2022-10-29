
package Dominio;

import Enumerados.TipoEntidad;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "registro_auditoria")
public class RegistroAuditoria implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fecha_hora_eliminacion")
    private Instant fechaHoraEliminacion;
    
    @Column(name = "tipo_entidad")
    private TipoEntidad tipoEntidad;
    
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_consultor", referencedColumnName = "id")
    private Consultor consultor;

    public Integer getId() {
        return id;
    }

    public Instant getFechaHoraEliminacion() {
        return fechaHoraEliminacion;
    }

    public void setFechaHoraEliminacion(Instant fechaHoraEliminacion) {
        this.fechaHoraEliminacion = fechaHoraEliminacion;
    }

    public TipoEntidad getTipoEntidad() {
        return tipoEntidad;
    }

    public void setTipoEntidad(TipoEntidad tipoEntidad) {
        this.tipoEntidad = tipoEntidad;
    }

    public Consultor getConsultor() {
        return consultor;
    }

    public void setConsultor(Consultor consultor) {
        this.consultor = consultor;
    } 
}
