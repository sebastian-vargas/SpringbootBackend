/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.modelos;

import co.edu.utp.isc.gia.backend.entidades.Respuesta;
import java.util.List;

/**
 *
 * @author johan
 */
public class PreguntaModelo {
    private int id;
    private int fk_examen_id;
    private String descripcion;
    private String imagen;
    private int valoracion;
    private String tipo;
    private List<Respuesta> respuestas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_examen_id() {
        return fk_examen_id;
    }

    public void setFk_examen_id(int fk_examen_id) {
        this.fk_examen_id = fk_examen_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    
    
 

   
    
    
}
