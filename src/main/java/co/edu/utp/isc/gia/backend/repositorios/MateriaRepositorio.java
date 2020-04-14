/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.repositorios;

import co.edu.utp.isc.gia.backend.entidades.Materia;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author johan
 */
public interface MateriaRepositorio extends Repository<Materia, Integer> {
    List<Materia>findAll();
    Materia findOne(int id);
    Materia save(Materia materia);
    void delete(Materia materia);  
}
