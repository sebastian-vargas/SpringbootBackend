/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;

import co.edu.utp.isc.gia.backend.entidades.Examen;
import co.edu.utp.isc.gia.backend.interfaces.ExamenService;
import co.edu.utp.isc.gia.backend.repositorios.ExamenRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceImp implements ExamenService{
    @Autowired
    private ExamenRepositorio examenRepositorio;

    @Override
    public List<Examen> listar() {
        return examenRepositorio.findAll();
    }

    @Override
    public Examen listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Examen crear(Examen examen) {
        return examenRepositorio.save(examen);
    }

    @Override
    public Examen editar(Examen examen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Examen eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
