/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.servicios;


import co.edu.utp.isc.gia.backend.entidades.Pregunta;
import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import co.edu.utp.isc.gia.backend.interfaces.PreguntaService;
import co.edu.utp.isc.gia.backend.modelos.PreguntaModelo;
import co.edu.utp.isc.gia.backend.repositorios.PreguntaRepositorio;
import co.edu.utp.isc.gia.backend.repositorios.RespuestaRepositorio;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author johan
 */
@Service
public class PreguntaServiceImp implements PreguntaService {

    @Autowired
    private PreguntaRepositorio preguntaRepositorio;

    @Autowired
    private RespuestaRepositorio respuestaRepositorio;

    @Override
    public List<Pregunta> listar() {
        return preguntaRepositorio.findAll();
    }
    
    @Override
    public List<PreguntaModelo> listarExamenId(int examen_id) {
        //Lista de preguntas del examen segun su id (examen_id)
        List<PreguntaModelo> preguntasRespuestas = new ArrayList<>();

        //Recibe todas las preguntas de la base de datos
        List<Pregunta> preguntas = preguntaRepositorio.findAll();
        //Revibe todas las respuestas de la base de datos
        List<Respuesta> respuestas = respuestaRepositorio.findAll();

        //Recorre la lista de preguntas traidas de la base de datos
        for(Pregunta p:preguntas){
            //Compara el campo fk_examen_id de la pregunta en el indice actual y el id del examen que entra por parametro en el metodo
            if(p.getFk_examen_id() == examen_id) {
                //Declara una lista temporal de respuestas
                List<Respuesta> respuestas_tmp = new ArrayList<>();

                //Recorre la lista de respuestas traidas de la base de datos
                for(Respuesta r:respuestas){
                    //Compara el id de la pregunta en el indice del ciclo padre y la propiedad fk_pregunta_id de la respuesta en el indice actual
                    if(r.getFk_pregunta_id() == p.getId()){
                        //agrega la respuesta a la lista temporal de respuestas
                        respuestas_tmp.add(r);
                    }
                }
                //agraga la pregunta en el indice actual a la lista que va a ser retornada
                preguntasRespuestas.add(
                    new PreguntaModelo(
                        p.getId(),
                        p.getFk_examen_id(),
                        p.getDescripcion(),
                        p.getImagen(),
                        p.getValoracion(),
                        p.getTipo(),
                        respuestas_tmp
                    )
                );
            }
            
        }

        return preguntasRespuestas;
    }

    @Override
    public Pregunta listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pregunta crearPreguntas(List<PreguntaModelo> preguntas) {

        for(PreguntaModelo preguntaModelo: preguntas) {

            System.out.println(preguntaModelo.getDescripcion());

            Pregunta p = new Pregunta(
                preguntaModelo.getFk_examen_id(), 
                preguntaModelo.getDescripcion(),
                preguntaModelo.getImagen(), 
                preguntaModelo.getValoracion(), 
                preguntaModelo.getTipo()
            );
    
            try {
                if (preguntaRepositorio.save(p) != null) {
    
                    if (preguntaModelo.getRespuestas().size() > 0) {
                        Respuesta r;
    
                        for(int i = 0; i < preguntaModelo.getRespuestas().size(); i++){
                            r = preguntaModelo.getRespuestas().get(i);
                            r.setFk_pregunta_id(p.getId());
    
                            respuestaRepositorio.save(r); 
                        }
                    } 
    
                }
    
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        

        return new Pregunta();
    }

    @Override
    public Pregunta crear(PreguntaModelo preguntaModelo) {

        Pregunta p = new Pregunta(
            preguntaModelo.getFk_examen_id(), 
            preguntaModelo.getDescripcion(),
            preguntaModelo.getImagen(), 
            preguntaModelo.getValoracion(), 
            preguntaModelo.getTipo()
        );

        try {
            if (preguntaRepositorio.save(p) != null) {

                if (preguntaModelo.getRespuestas().size() > 0) {
                    Respuesta r;

                    for(int i = 0; i < preguntaModelo.getRespuestas().size(); i++){
                        r = preguntaModelo.getRespuestas().get(i);
                        r.setFk_pregunta_id(p.getId());

                        respuestaRepositorio.save(r); 
                    }
                    System.out.println("Guardado correctamente con respuestas");
                    return p;
                } else {
                    System.out.println("Guardado correctamente");
                    return p;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;

    }

    @Override
    public Pregunta editar(Pregunta pregunta) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Pregunta eliminar(int id) {
        // TODO Auto-generated method stub
        return null;
    }

}
