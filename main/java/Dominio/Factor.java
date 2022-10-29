
package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factor")
public class Factor implements Serializable{
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private Integer codigo;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private Integer orden;
    
    @Column
    private Boolean eliminado;
    
    
    private List<Pregunta> preguntas;
    
    
    private RegistroAuditoria registroAuditoria;

    public Factor(Integer codigo, String nombre, String descripcion, Integer orden) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.orden = orden;
        this.eliminado = false;
        this.preguntas = new ArrayList<Pregunta>();
        this.registroAuditoria = null;
    }

    public Factor(Integer codigo, String nombre, String descripcion, Integer orden, List<Pregunta> preguntas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.orden = orden;
        this.eliminado = false;
        this.preguntas = preguntas;
        this.registroAuditoria = null;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public RegistroAuditoria getRegistroAuditoria() {
        return registroAuditoria;
    }

    public void setRegistroAuditoria(RegistroAuditoria registroAuditoria) {
        this.registroAuditoria = registroAuditoria;
    }   
}
