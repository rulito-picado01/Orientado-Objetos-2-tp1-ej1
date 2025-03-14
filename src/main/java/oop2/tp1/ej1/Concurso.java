package oop2.tp1.ej1;

import javax.swing.*;
import java.time.LocalDate;

public class Concurso {
    private final String nombre;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaFinInscripcion;

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaInicioInscripcion = fechaInicio;
        this.fechaFinInscripcion = fechaFin;
    }

    public Inscripcion inscribirParticipante(Participante participante) {
        LocalDate fechaHoy = LocalDate.now();

        if (fechaHoy.isBefore(fechaInicioInscripcion) || fechaHoy.isAfter(fechaFinInscripcion)) {
            JOptionPane.showMessageDialog(null, "No puedes inscribirte fuera del período de inscripción.",
                    "Error de Inscripción", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Inscripcion inscripcion = new Inscripcion(participante, this, fechaHoy);

        if (fechaHoy.equals(fechaInicioInscripcion)) {
            participante.agregarPuntos(10);
        }
        return inscripcion;
    }
}
