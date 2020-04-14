/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.repositorios;

import co.edu.utp.isc.gia.backend.entidades.Examen;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author johan
 */
public interface ExamenRepositorio extends Repository<Examen, Integer>{
    List<Examen>findAll();
    Examen findOne(int id);
    Examen save(Examen examen);
    void delete(Examen examen); 
}
