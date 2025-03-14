package oop2.tp1.ej1;

import java.time.LocalDate;

public class Inscripcion {
    private Participante participante;
    private Concurso concurso;
    private LocalDate fechaInscripcion;

    public Inscripcion(Participante participante, Concurso concurso, LocalDate fechaIncripcion) {
        this.participante = participante;
        this.concurso = concurso;
        this.fechaInscripcion = fechaIncripcion;
    }


}
