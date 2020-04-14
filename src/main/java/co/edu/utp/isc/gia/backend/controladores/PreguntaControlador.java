/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.controladores;

import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import co.edu.utp.isc.gia.backend.interfaces.PreguntaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    @PostMapping
    public Pregunta agregar(@RequestBody Pregunta pregunta){
        return preguntaService.crear(pregunta);
    }
    
}
