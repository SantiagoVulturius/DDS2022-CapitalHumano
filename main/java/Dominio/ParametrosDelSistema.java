
package Dominio;


public class ParametrosDelSistema {
      private Integer id;
    private String instrucciones;
    private Integer cantPreguntasBloque;
    private Integer accesosPermitidos;
    private Integer tiempoMaximoPermitido; 
    private Integer tiempoMaximoActivoPermitido;

    public Integer getId() {
        return id;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Integer getCantPreguntasBloque() {
        return cantPreguntasBloque;
    }

    public void setCantPreguntasBloque(Integer cantPreguntasBloque) {
        this.cantPreguntasBloque = cantPreguntasBloque;
    }

    public Integer getAccesosPermitidos() {
        return accesosPermitidos;
    }

    public void setAccesosPermitidos(Integer accesosPermitidos) {
        this.accesosPermitidos = accesosPermitidos;
    }

    public Integer getTiempoMaximoPermitido() {
        return tiempoMaximoPermitido;
    }

    public void setTiempoMaximoPermitido(Integer tiempoMaximoPermitido) {
        this.tiempoMaximoPermitido = tiempoMaximoPermitido;
    }

    public Integer getTiempoMaximoActivoPermitido() {
        return tiempoMaximoActivoPermitido;
    }

    public void setTiempoMaximoActivoPermitido(Integer tiempoMaximoActivoPermitido) {
        this.tiempoMaximoActivoPermitido = tiempoMaximoActivoPermitido;
    }   
}
