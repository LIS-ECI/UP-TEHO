package com.pcvpmo.pdsw.upteho.dao.mybatis;

import com.google.inject.Inject;
import com.pcvpmo.pdsw.upteho.dao.AsignaturaDAO;
import com.pcvpmo.pdsw.upteho.dao.PersistenceException;
import com.pcvpmo.pdsw.upteho.dao.mybatis.mappers.AsignaturaMapper;
import com.pcvpmo.pdsw.upteho.entities.Asignatura;
import java.util.List;

/**
 * Implementacion de AsignaturaDAO MyBATIS
 * @author Daniel Ospina - Juan Camilo Mantilla
 */
public class MyBATISAsignaturaDAO implements AsignaturaDAO {
    
    @Inject
    private AsignaturaMapper asignaturaMapper;

    @Override
    public List<Asignatura> consultarAsignaturasxPrograma(Integer idPrograma) throws PersistenceException {
        return asignaturaMapper.consultarAsignaturasxPrograma(idPrograma);
    }

    @Override
    public Asignatura consultarAsignaturaPorID(Integer id) throws PersistenceException {
        return asignaturaMapper.getAsignaturaPorID(id);
    }


    @Override
    public List<Asignatura> consultarAsignaturas() throws PersistenceException {
        return asignaturaMapper.consultarAsignaturas();
    }

    @Override
    public void registrarAsignatura(String nombreAsig, int idProg) throws PersistenceException {
        asignaturaMapper.registrarAsignatura(nombreAsig, idProg);
    }

    @Override
    public void registrarAsignatura(int idAsignatura, String nombreAsig, int idProg) throws PersistenceException {
        asignaturaMapper.registrarAsignaturaFull(idAsignatura, nombreAsig, idProg);
    }
}
