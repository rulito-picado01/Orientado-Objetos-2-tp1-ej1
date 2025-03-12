package oop2.tp1.ej1;

import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private final String nombre;
    private List<Inscripcion> inscriptos;

    public Concurso(String nombre) {
        this.nombre = nombre;
        this.inscriptos = new ArrayList<>();
    }

    public boolean participanteInscripto(Participante participante) {

    }
}
