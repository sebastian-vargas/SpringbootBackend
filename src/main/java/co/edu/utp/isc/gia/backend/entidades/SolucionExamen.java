/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author johan
 */
@Entity
@Table(name = "solucion_examen")
public class SolucionExamen {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int fk_estudiante_id;
    @Column
    private int fk_pregunta_id;
    @Column
    private int fk_examen_id;    
    @Column
    private int valoracion_obtenida;
    @Column
    private String respuesta_abierta;
    @Column
    private boolean revisada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_estudiante_id() {
        return fk_estudiante_id;
    }

    public void setFk_estudiante_id(int fk_estudiante_id) {
        this.fk_estudiante_id = fk_estudiante_id;
    }

    public int getFk_pregunta_id() {
        return fk_pregunta_id;
    }

    public void setFk_pregunta_id(int fk_pregunta_id) {
        this.fk_pregunta_id = fk_pregunta_id;
    }

    public int getFk_examen_id() {
        return fk_examen_id;
    }

    public void setFk_examen_id(int fk_examen_id) {
        this.fk_examen_id = fk_examen_id;
    }

    public int getValoracion_obtenida() {
        return valoracion_obtenida;
    }

    public void setValoracion_obtenida(int valoracion_obtenida) {
        this.valoracion_obtenida = valoracion_obtenida;
    }

    public String getRespuesta_abierta() {
        return respuesta_abierta;
    }

    public void setRespuesta_abierta(String respuesta_abierta) {
        this.respuesta_abierta = respuesta_abierta;
    }

    public boolean isRevisada() {
        return revisada;
    }

    public void setRevisada(boolean revisada) {
        this.revisada = revisada;
    }

    
    
    
    
    
}
