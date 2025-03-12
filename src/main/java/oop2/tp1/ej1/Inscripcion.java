package oop2.tp1.ej1;

import java.time.LocalDateTime;

public class Inscripcion {
    private Participante participante;
    private Concurso concurso;
    private LocalDateTime fechaInscripcion;

    public Inscripcion(Participante participante, Concurso concurso, LocalDateTime fechaIncripcion) {
        this.participante = participante;
        this.concurso = concurso;
        this.fechaInscripcion = fechaIncripcion;
    }
}
