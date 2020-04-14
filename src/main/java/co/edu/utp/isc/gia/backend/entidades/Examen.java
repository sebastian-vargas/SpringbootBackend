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
@Table(name = "examenes")
public class Examen {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int fk_materia;
    @Column
    private String descripcion;
    @Column
    private int nota_maxima;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_materia() {
        return fk_materia;
    }

    public void setFk_materia(int fk_materia) {
        this.fk_materia = fk_materia;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNota_maxima() {
        return nota_maxima;
    }

    public void setNota_maxima(int nota_maxima) {
        this.nota_maxima = nota_maxima;
    }

   

  
 
}
