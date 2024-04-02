package domain;

import domains.Alumno;
import domains.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlumnoNoInscripto {
    @Test
    public void alumnoNoInscripto(){
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);

        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(matematica);

        Alumno alumno = new Alumno("Elias", materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);

        alumno.inscirbirse(materiasParaInscribirse);
        Assert.assertTrue(alumno.getEstadoInscripcion());
    }


}
