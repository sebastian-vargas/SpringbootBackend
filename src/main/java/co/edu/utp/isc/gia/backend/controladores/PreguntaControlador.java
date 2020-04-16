/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.controladores;

import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import co.edu.utp.isc.gia.backend.interfaces.PreguntaService;
import co.edu.utp.isc.gia.backend.modelos.PreguntaModelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johan
 */
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)//url de angular
@RestController
@RequestMapping({"/preguntas"})
public class PreguntaControlador {
    @Autowired
    PreguntaService preguntaService;
    
    @GetMapping
    public List<Pregunta>listar(){
        return preguntaService.listar();
    }
    
    @GetMapping(path = "/{examen_id}")
    public List<PreguntaModelo>listarExamenId(@PathVariable("examen_id") int examen_id){
        return preguntaService.listarExamenId(examen_id);
    }
    @PostMapping
    public Pregunta agregar(@RequestBody PreguntaModelo preguntaModelo){
        return preguntaService.crear(preguntaModelo);
    }
    
}
