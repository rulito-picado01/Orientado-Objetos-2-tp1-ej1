package oop2.tp1.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class ConcursoTest {
    private Concurso concurso;
    private Participante participante;

    @BeforeEach
    public void test01() {
        LocalDate inicio = LocalDate.now();
        LocalDate fin = inicio.plusDays(5);
        concurso = new Concurso("Concurso de Programación", inicio, fin);
        participante = new Participante("43685592", "Facundo");

    }

    @Test
    public void test02() {
        Inscripcion inscripcion = participante.inscribirse(concurso);
        assertNotNull(inscripcion, "La inscripción debe ser exitosa");
    }

    @Test
    public void test03() {
        participante.inscribirse(concurso);
        assertEquals(10, participante.puntosGanados());
    }

    @Test
    public void test04() {
        LocalDate inicio = LocalDate.now().plusDays(3);
        LocalDate fin = inicio.plusDays(5);
        Concurso otroConcurso = new Concurso("Oferta de Trabajo", inicio, fin);

        participante.inscribirse(otroConcurso);
        assertFalse(otroConcurso.estaInscripto(participante));
    }

}
