/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;

import co.edu.utp.isc.gia.backend.entidades.Profesor;
import co.edu.utp.isc.gia.backend.interfaces.ProfesorService;
import co.edu.utp.isc.gia.backend.repositorios.ProfesorRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class ProfesorServiceImp implements ProfesorService {
    @Autowired
    private ProfesorRepositorio profesorRepositorio;

    @Override
    public List<Profesor> listar() {
        return profesorRepositorio.findAll();
    }

    @Override
    public Profesor listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor crear(Profesor profesor) {
        return profesorRepositorio.save(profesor);

    }

    @Override
    public Profesor editar(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
