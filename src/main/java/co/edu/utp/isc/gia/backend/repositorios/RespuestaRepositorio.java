package co.edu.utp.isc.gia.backend.repositorios;

import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import java.util.List;



import org.springframework.data.repository.Repository;

public interface RespuestaRepositorio extends Repository<Respuesta, Integer> {

    List<Respuesta>findAll();
    Respuesta findOne(int id);
    Respuesta save(Respuesta respuesta);
    void delete(Respuesta respuesta);

}