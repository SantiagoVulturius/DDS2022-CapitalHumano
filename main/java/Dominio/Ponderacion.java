
package Dominio;

import java.util.List;

public class Ponderacion {
     private Integer id;
    private Integer ponderacion;
    private List<ItemOpcionRespuesta> itemsOpciones;

    public Ponderacion(Integer ponderacion, List<ItemOpcionRespuesta> itemsOpciones) {
        this.ponderacion = ponderacion;
        this.itemsOpciones = itemsOpciones;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Integer ponderacion) {
        this.ponderacion = ponderacion;
    }

    public List<ItemOpcionRespuesta> getItemsOpciones() {
        return itemsOpciones;
    }

    public void setItemsOpciones(List<ItemOpcionRespuesta> itemsOpciones) {
        this.itemsOpciones = itemsOpciones;
    }
}
