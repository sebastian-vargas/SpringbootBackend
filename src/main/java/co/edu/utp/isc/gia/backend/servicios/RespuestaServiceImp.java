package co.edu.utp.isc.gia.backend.servicios;

import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import co.edu.utp.isc.gia.backend.interfaces.RespuestaService;
import co.edu.utp.isc.gia.backend.repositorios.RespuestaRepositorio;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaServiceImp implements RespuestaService {

    @Autowired
    private RespuestaRepositorio respuestaRepositorio;

    @Override
    public List<Respuesta> listar() {
        return respuestaRepositorio.findAll();
    }

    @Override
    public Respuesta listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Respuesta crear(Respuesta respuesta) {
        return respuestaRepositorio.save(respuesta);
    }

    @Override
    public Respuesta editar(Respuesta respuesta) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Respuesta eliminar(int id) {
        // TODO Auto-generated method stub
        return null;
    }



}