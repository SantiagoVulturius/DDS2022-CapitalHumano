
package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private String pregunta;
    
    @Column
    private String descripcion;
    
    @Column
    private Boolean eliminado;
    
    
    private OpcionRespuesta opcionRespuesta;
    
    
    private List<Ponderacion> ponderaciones;
    
    
    private RegistroAuditoria registroAuditoria;

    public Pregunta(String nombre, String pregunta, String descripcion, OpcionRespuesta opcionRespuesta, List<Ponderacion> ponderaciones) {
        this.nombre = nombre;
        this.pregunta = pregunta;
        this.descripcion = descripcion;
        this.eliminado = false;
        this.opcionRespuesta = opcionRespuesta;
        this.ponderaciones = ponderaciones;
        this.registroAuditoria = null;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public OpcionRespuesta getOpcionRespuesta() {
        return opcionRespuesta;
    }

    public void setOpcionRespuesta(OpcionRespuesta opcionRespuesta) {
        this.opcionRespuesta = opcionRespuesta;
    }

    public List<Ponderacion> getPonderaciones() {
        return ponderaciones;
    }

    public void setPonderaciones(List<Ponderacion> ponderaciones) {
        this.ponderaciones = ponderaciones;
    }

    public RegistroAuditoria getRegistroAuditoria() {
        return registroAuditoria;
    }

    public void setRegistroAuditoria(RegistroAuditoria registroAuditoria) {
        this.registroAuditoria = registroAuditoria;
    }   
}
