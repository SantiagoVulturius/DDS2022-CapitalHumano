
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
@Table(name = "opcion_respuesta")
public class OpcionRespuesta implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private Boolean eliminado;
    
    
    private List<ItemOpcionRespuesta> items;
    
    
    private RegistroAuditoria registroAuditoria;

    public OpcionRespuesta(String nombre, String descripcion, List<ItemOpcionRespuesta> items) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.eliminado = false;
        this.items = items;
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

    public List<ItemOpcionRespuesta> getItems(){
        return items;
    }

    public void setItems(List<ItemOpcionRespuesta> items){
        this.items = items;
    }

    public RegistroAuditoria getRegistroAuditoria() {
        return registroAuditoria;
    }

    public void setRegistroAuditoria(RegistroAuditoria registroAuditoria) {
        this.registroAuditoria = registroAuditoria;
    }
}
