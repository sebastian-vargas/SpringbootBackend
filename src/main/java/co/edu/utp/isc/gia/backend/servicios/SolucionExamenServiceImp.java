/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;

import co.edu.utp.isc.gia.backend.entidades.SolucionExamen;
import co.edu.utp.isc.gia.backend.interfaces.SolucionExamenService;
import co.edu.utp.isc.gia.backend.repositorios.SolucionExamenRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class SolucionExamenServiceImp implements SolucionExamenService  {
    @Autowired
    private SolucionExamenRepositorio solucionExamenRepositorio;

    @Override
    public List<SolucionExamen> listar() {
        return solucionExamenRepositorio.findAll();
    }

    @Override
    public SolucionExamen listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SolucionExamen crear(SolucionExamen solucionExamen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SolucionExamen editar(SolucionExamen solucionExamen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SolucionExamen eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
