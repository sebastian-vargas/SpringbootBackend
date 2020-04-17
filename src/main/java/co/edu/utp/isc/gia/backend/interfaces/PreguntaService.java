/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.interfaces;


import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import co.edu.utp.isc.gia.backend.modelos.PreguntaModelo;
import java.util.List;

/**
 *
 * @author johan
 */
public interface PreguntaService {
    
    List<Pregunta>listar();
    List<PreguntaModelo>listarExamenId(int examen_id);
    Pregunta listarId(int id);
    Pregunta crear(PreguntaModelo pregunta);
    Pregunta crearPreguntas(List<PreguntaModelo> pregunta);
    Pregunta editar(Pregunta pregunta);
    Pregunta eliminar(int id);

}
