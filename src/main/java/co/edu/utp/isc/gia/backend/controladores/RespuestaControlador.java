package co.edu.utp.isc.gia.backend.controladores;

import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import co.edu.utp.isc.gia.backend.interfaces.RespuestaService;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600) // url de angular
@RestController
@RequestMapping({"/respuestas"})
public class RespuestaControlador {

    @Autowired
    RespuestaService respuestaService;

    @GetMapping
    public List<Respuesta>listar(){
        return respuestaService.listar();
    }
    @PostMapping
    public Respuesta agregar(@RequestBody Respuesta respuesta){
        return respuestaService.crear(respuesta);
    }
    
}