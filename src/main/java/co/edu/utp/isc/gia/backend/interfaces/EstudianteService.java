/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.interfaces;

import co.edu.utp.isc.gia.backend.entidades.Estudiante;
import java.util.List;

/**
 *
 * @author johan
 */

public interface EstudianteService {
    List<Estudiante>listar();
    Estudiante listarId(int id);
    Estudiante crear(Estudiante estudiante);
    Estudiante editar(Estudiante estudiante);
    Estudiante eliminar(int id);
    
}
