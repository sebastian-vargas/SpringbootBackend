/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.interfaces;


import co.edu.utp.isc.gia.backend.entidades.Materia;
import java.util.List;

/**
 *
 * @author johan
 */
public interface MateriaService {   
    List<Materia>listar();
    Materia listarId(int id);
    Materia crear(Materia materia);
    Materia editar(Materia materia);
    Materia eliminar(int id);   
}
