
package Dtos;

public class CompetenciaDTO {
    private Integer id;
    private Integer ponderacion;

    public CompetenciaDTO(Integer id, Integer ponderacion) {
        this.id = id;
        this.ponderacion = ponderacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Integer ponderacion) {
        this.ponderacion = ponderacion;
    }
}
