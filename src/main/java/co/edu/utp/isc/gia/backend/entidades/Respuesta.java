package co.edu.utp.isc.gia.backend.entidades;

import javax.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int fk_pregunta_id;
    @Column
    private String respuesta;
    @Column
    private boolean correcta;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_pregunta_id() {
        return this.fk_pregunta_id;
    }

    public void setFk_pregunta_id(int fk_pregunta_id) {
        this.fk_pregunta_id = fk_pregunta_id;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return this.correcta;
    }

    public boolean getCorrecta() {
        return this.correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }


}