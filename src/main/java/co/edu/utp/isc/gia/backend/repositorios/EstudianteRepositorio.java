/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.repositorios;

import co.edu.utp.isc.gia.backend.entidades.Estudiante;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author johan
 */
public interface EstudianteRepositorio extends Repository<Estudiante, Integer> {
    List<Estudiante>findAll();
    Estudiante findOne(int id);
    Estudiante save(Estudiante estudiante);
    void delete(Estudiante estudiante); 
    
}
