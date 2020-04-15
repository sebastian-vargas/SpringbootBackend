/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.interfaces;

import co.edu.utp.isc.gia.backend.entidades.SolucionExamen;
import java.util.List;

/**
 *
 * @author johan
 */
public interface SolucionExamenService {
    List<SolucionExamen>listar();
    SolucionExamen listarId(int id);
    SolucionExamen crear(SolucionExamen solucionExamen);
    SolucionExamen editar(SolucionExamen solucionExamen);
    SolucionExamen eliminar(int id);
    
}
