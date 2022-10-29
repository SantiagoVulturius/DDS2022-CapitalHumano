
package Dominio;

import Enumerados.TipoCompetencia;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "competencia")
public class Competencia implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Integer codigo;
    private String nombre;
    private String descripcion;
    private TipoCompetencia tipoCompetencia;
    private Boolean eliminado;
    private List<Factor> factores;
    private RegistroAuditoria registroAuditoria;
}
