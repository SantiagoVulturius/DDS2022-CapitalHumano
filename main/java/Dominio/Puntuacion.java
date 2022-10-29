
package Dominio;

import java.util.List;

public class Puntuacion {
     private Integer id;
    private Integer puntajeMinimo;
    private List<Competencia> competencias;

    public Puntuacion() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getPuntajeMinimo() {
        return puntajeMinimo;
    }

    public void setPuntajeMinimo(Integer puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
}
