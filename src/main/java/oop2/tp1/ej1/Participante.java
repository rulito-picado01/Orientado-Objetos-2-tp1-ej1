package oop2.tp1.ej1;

public class Participante {
    private String dni;
    private String nombre;
    private int puntos;

    public Participante(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void inscribirse(Concurso concurso) {
        Inscripcion incripcion = concurso.inscribirParticipante(this);
        
    }
}
