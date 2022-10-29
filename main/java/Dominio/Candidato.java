
package Dominio;

import Enumerados.TipoDocumento;
import java.time.Instant;


public class Candidato {
    private Integer id;
    private TipoDocumento tipoDocumento;
    private String documento;
    private Integer numeroCandidato;
    private String apellido;
    private String nombre;
    private Instant fechaNacimiento;
    private String nacionalidad;
    private String email;
    private String escolaridad;
    private Boolean eliminado;
    //falta poner Cuestionario

    public Integer getId() {
        return id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(Integer numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instant getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Instant fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }
}
