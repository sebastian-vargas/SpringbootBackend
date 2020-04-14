package co.edu.utp.isc.gia.backend.interfaces;
import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import java.util.List;



public interface RespuestaService {

    List<Respuesta>listar();
    Respuesta listarId(int id);
    Respuesta crear(Respuesta respuesta);
    Respuesta editar(Respuesta respuesta);
    Respuesta eliminar(int id);

}