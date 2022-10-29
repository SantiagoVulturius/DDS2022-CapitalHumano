
package Gestores;
import Daos.FactoryDao;
import Daos.interfaces.PuestoDao;
import Dtos.PuestoDTO;
import Excepciones.DatosNoValidosAltaPuestoExcecption;


public final class GestorPuesto {
     private static GestorPuesto instancia;
    private FactoryDao factory;
    private PuestoDao puestoDao;
    
    private GestorPuesto(){
    }
    
    public synchronized static GestorPuesto getInstance(){
        if(instancia == null)
            instancia = new GestorPuesto();
        return instancia;
    }
    
    public void altaPuesto(PuestoDTO puestoDto){
        Boolean datosValidos = validarDatos(puestoDto);
        //if(!datosValidos) throw new DatosNoValidosAltaPuestoExcecption();
        factory = FactoryDao.getFactory(FactoryDao.POSTGRESQL_FACTORY);
        puestoDao = factory.getPuestoDao();
        
    }

    private Boolean validarDatos(PuestoDTO puestoDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
