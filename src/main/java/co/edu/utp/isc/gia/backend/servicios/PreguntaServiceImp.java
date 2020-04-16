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
    public List<PreguntaModelo>listarExamenId(int examen_id){
        List<PreguntaModelo> preguntasRespuestas = new ArrayList<>();
        
        //Recibe todas las preguntas de la BD
        List<Pregunta> preguntas = preguntaRepositorio.findAll();
        //Recibe todas las respuestas de lA BD
        List<Respuesta> respuestas = respuestaRepositorio.findAll();
        
        //Recorre la lista de preguntas traidas de la base de datos
        for(Pregunta p:preguntas){
            //compara el campo fk_exmaen_id de lña pregunta en el indice actuqal y el id del examen que entra por parametro en el metodo
            if(p.getFk_examen_id() == examen_id){
                //declara una lista temporal de respuestas
                List<Respuesta> respuestas_tmp = new ArrayList<>();
                //recorre la lista de respuestas traidas de la base de datos
                for(Respuesta r:respuestas){
                    //compara el id de la pregunta en el indice del ciclo padre y la propiedad fk_pregunta_id de la respuesta en el indice actual
                    if(r.getFk_pregunta_id() == p.getId()){
                        //agrega la respuesta a la lista temporal de respuestas
                        respuestas_tmp.add(r);
                    }
                }
                //agrgea la pregunta en el indice actual a la lista que va a ser retornada
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
        try{
            if(preguntaRepositorio.save(p)!= null){
                if(preguntaModelo.getRespuestas().size() > 0){
                    Respuesta r;
                    
                    for(int i = 0; i<preguntaModelo.getRespuestas().size(); i++){
                    r = preguntaModelo.getRespuestas().get(i);
                    r.setFk_pregunta_id(p.getId());
                    
                    respuestaRepositorio.save(r); 
                    }
                    System.out.println("Guardado correcto con respuesta multiple");
                    return p;                    
                }else{
                    System.out.println("Guardado correcto unica respuesta");
                    
                }
            }
        } catch(Exception e){
                        System.out.println(e.getMessage());
                        }
        return null;
        
    }

    @Override
    public Pregunta editar(Pregunta pregunta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pregunta eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
