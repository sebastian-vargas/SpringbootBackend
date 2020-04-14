/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.controladores;


import co.edu.utp.isc.gia.backend.entidades.Materia;
import co.edu.utp.isc.gia.backend.interfaces.MateriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author johan
 */
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)//url de angular
@RestController
@RequestMapping({"/materias"})
public class MateriaControlador {
    @Autowired
    MateriaService materiaService;
    
    @GetMapping
    public List<Materia>listar(){
        return materiaService.listar();
    } 
    @PostMapping
    public Materia agregar(@RequestBody Materia materia){
        return materiaService.crear(materia);
    }
}
