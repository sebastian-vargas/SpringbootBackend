/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;


import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import co.edu.utp.isc.gia.backend.interfaces.PreguntaService;
import co.edu.utp.isc.gia.backend.repositorios.PreguntaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class PreguntaServiceImp implements PreguntaService {
    @Autowired
    private PreguntaRepositorio preguntaRepositorio;

    @Override
    public List<Pregunta> listar() {
        return preguntaRepositorio.findAll();
    }

    @Override
    public Pregunta listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pregunta crear(Pregunta pregunta) {
        return preguntaRepositorio.save(pregunta);
    }

    @Override
    public Pregunta editar(Pregunta pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pregunta eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
