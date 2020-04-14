/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.interfaces;

import co.edu.utp.isc.gia.backend.entidades.Profesor;
import java.util.List;

/**
 *
 * @author johan
 */
public interface ProfesorService {
    List<Profesor>listar();
    Profesor listarId(int id);
    Profesor crear(Profesor profesor);
    Profesor editar(Profesor profesor);
    Profesor eliminar(int id);
    
}
