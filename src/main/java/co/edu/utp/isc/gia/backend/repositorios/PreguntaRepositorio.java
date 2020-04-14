/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.repositorios;


import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author johan
 */
public interface PreguntaRepositorio extends Repository<Pregunta, Integer> {
    
    List<Pregunta>findAll();
    Pregunta findOne(int id);
    Pregunta save(Pregunta pregunta);
    void delete(Pregunta pregunta);
    
}
