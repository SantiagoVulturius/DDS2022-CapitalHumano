
package Daos;

import Daos.interfaces.CandidatoDao;
import Daos.interfaces.CompetenciaDao;
import Daos.interfaces.ConsultorDao;
import Daos.interfaces.CuestionarioDao;
import Daos.interfaces.EjecucionDao;
import Daos.interfaces.EvaluacionDao;
import Daos.interfaces.FactorDao;
import Daos.interfaces.OpcionRespuestaDao;
import Daos.interfaces.ParametrosDao;
import Daos.interfaces.PreguntaDao;
import Daos.interfaces.PuestoDao;
import Daos.interfaces.RegistroAuditoriaDao;
import Daos.interfaces.RespuestaDao;


public class PGFactoryDao extends FactoryDao {

    @Override
    public RegistroAuditoriaDao getRegistroAuditoriaDao() {
        return new RegistroAuditoriaDao() {};
    }

    @Override
    public PuestoDao getPuestoDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ConsultorDao getConsultorDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CandidatoDao getCandidatoDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EvaluacionDao getEvaluacionDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EjecucionDao getEjecucionDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ParametrosDao getParametrosDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuestionarioDao getCuestionarioDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RespuestaDao getRespuestaDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OpcionRespuestaDao getOpcionRespuestaDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PreguntaDao getPreguntaDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FactorDao getFactorDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CompetenciaDao getCompetenciaDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
