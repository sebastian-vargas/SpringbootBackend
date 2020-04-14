/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;


import co.edu.utp.isc.gia.backend.entidades.Examen;
import co.edu.utp.isc.gia.backend.entidades.Materia;
import co.edu.utp.isc.gia.backend.interfaces.MateriaService;
import co.edu.utp.isc.gia.backend.repositorios.MateriaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class MateriaServiceImp implements MateriaService {
    @Autowired
    private MateriaRepositorio materiaRepositorio;

    @Override
    public List<Materia> listar() {
        return materiaRepositorio.findAll(); 
    }

    @Override
    public Materia listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia crear(Materia materia) {
        return materiaRepositorio.save(materia);
    }

    @Override
    public Materia editar(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
