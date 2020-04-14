/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.controladores;

import co.edu.utp.isc.gia.backend.entidades.Profesor;
import co.edu.utp.isc.gia.backend.interfaces.ProfesorService;
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
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600) // url de angular
@RestController
@RequestMapping({"/profesores"})
public class ProfesorControlador {
    @Autowired
    ProfesorService profesorService;

    @GetMapping
    public List<Profesor>listar(){
        return profesorService.listar();
    }
    @PostMapping
    public Profesor agregar(@RequestBody Profesor profesor){
        return profesorService.crear(profesor);
    }
    
}
