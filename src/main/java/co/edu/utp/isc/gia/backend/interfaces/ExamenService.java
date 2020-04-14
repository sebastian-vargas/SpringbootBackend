
package co.edu.utp.isc.gia.backend.interfaces;

import co.edu.utp.isc.gia.backend.entidades.Examen;
import java.util.List;


public interface ExamenService {
    List<Examen>listar();
    Examen listarId(int id);
    Examen crear(Examen examen);
    Examen editar(Examen examen);
    Examen eliminar(int id);
    
}
