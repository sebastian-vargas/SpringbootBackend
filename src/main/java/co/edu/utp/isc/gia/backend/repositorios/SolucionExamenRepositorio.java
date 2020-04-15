/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.repositorios;

import co.edu.utp.isc.gia.backend.entidades.SolucionExamen;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author johan
 */
public interface SolucionExamenRepositorio extends Repository<SolucionExamen, Integer>  {
    List<SolucionExamen>findAll();
    SolucionExamen findOne(int id);
    SolucionExamen save(SolucionExamen solucionExamen);
    void delete(SolucionExamen solucionExamen);
    
}
