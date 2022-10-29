
package Dtos;

import java.util.List;

public class PuestoDTO {
     private Integer id;
    private String codigo;
    private String nombre;
    private String empresa;
    private String descripcion;
    private List<CompetenciaDTO> competencias;

    public PuestoDTO(Integer id, String codigo, String nombre, String empresa, String descripcion, List<CompetenciaDTO> competencias) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.competencias = competencias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<CompetenciaDTO> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<CompetenciaDTO> competencias) {
        this.competencias = competencias;
    }
}
