
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class ItemOpcionRespuesta implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String descripcion;
    
    @Column(name = "orden_visualizacion")
    private Integer ordenVisualizacion;

    public ItemOpcionRespuesta(String descripcion, Integer ordenVisualizacion) {
        this.descripcion = descripcion;
        this.ordenVisualizacion = ordenVisualizacion;
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getOrdenVisualizacion() {
        return ordenVisualizacion;
    }

    public void setOrdenVisualizacion(Integer ordenVisualizacion) {
        this.ordenVisualizacion = ordenVisualizacion;
    }
}
