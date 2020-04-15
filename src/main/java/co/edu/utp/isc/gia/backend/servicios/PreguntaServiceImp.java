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
