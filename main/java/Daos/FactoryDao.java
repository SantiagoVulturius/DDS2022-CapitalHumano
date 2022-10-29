/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

public abstract class FactoryDao {
    public static final int POSTGRESQL_FACTORY = 1;

    public static FactoryDao getFactory(int claveFactory){
        switch(claveFactory){
            case POSTGRESQL_FACTORY:
                return new PGFactoryDao();
            default:
                return null;
        }
    }

    public abstract RegistroAuditoriaDao getRegistroAuditoriaDao();
    public abstract PuestoDao getPuestoDao();
    public abstract ConsultorDao getConsultorDao();
    public abstract CandidatoDao getCandidatoDao();
    public abstract EvaluacionDao getEvaluacionDao();
    public abstract EjecucionDao getEjecucionDao();
    public abstract ParametrosDao getParametrosDao();
    public abstract CuestionarioDao getCuestionarioDao();
    public abstract RespuestaDao getRespuestaDao();
    public abstract OpcionRespuestaDao getOpcionRespuestaDao();
    public abstract PreguntaDao getPreguntaDao();
    public abstract FactorDao getFactorDao();
    public abstract CompetenciaDao getCompetenciaDao();
}
