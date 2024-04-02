package domain;

import domains.Alumno;
import domains.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestAlumnoInscripto {


    @Test
    public void alumnoInscripto() {
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);

        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);
        materiasAprobadas.add(literatura);


        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);

        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertTrue(elias.getEstadoInscripcion());
    }

    @Test
    public void alumnoInscriptoMasDeUnaMateria() {
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);
        Materia paradigmas = new Materia("Paradigmas", null);
        Materia discretas = new Materia("Discretas", null);
        Materia disenioSistmeas = new Materia("Diseño de sistemas", null);
        Materia arquitectura = new Materia("Arquitectura de las computadoras", null);
        Materia ingles = new Materia("Ingles", null);


        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> correlativasParadigmas = new ArrayList<>();
        correlativasParadigmas.add(historia);
        correlativasParadigmas.add(discretas);
        paradigmas.setCorrelativas(correlativasParadigmas);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);
        materiasAprobadas.add(literatura);
        materiasAprobadas.add(discretas);


        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);
        materiasParaInscribirse.add(paradigmas);

        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertTrue(elias.getEstadoInscripcion());
    }

    //Trato de inscribirme a paradigmas pero como sus correlativas son
    @Test
    public void alumnoNoInscripto() {
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);

        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);


        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);

        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertFalse(elias.getEstadoInscripcion());
    }

    @Test
    public void alumnoNoInscriptoMasDeUnaMateria() {
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);
        Materia paradigmas = new Materia("Paradigmas", null);
        Materia discretas = new Materia("Discretas", null);


        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> correlativasParadigmas = new ArrayList<>();
        correlativasParadigmas.add(historia);
        correlativasParadigmas.add(discretas);
        paradigmas.setCorrelativas(correlativasParadigmas);

        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);
        materiasAprobadas.add(literatura);
        // materiasAprobadas.add(discretas);


        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);
        materiasParaInscribirse.add(paradigmas);

        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertFalse(elias.getEstadoInscripcion());
    }


    @Test
    public void alumnoInscriptoMasDeUnaMateriaMasCorrelativas(){
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);
        Materia paradigmas = new Materia("Paradigmas", null);
        Materia discretas = new Materia("Discretas", null);
        Materia disenioSistmeas = new Materia("Diseño de sistemas", null);
        Materia arquitectura = new Materia("Arquitectura de las computadoras", null);
        Materia ingles = new Materia("Ingles", null);


        //CORRELATIVAS
        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        List<Materia> correlativasParadigmas = new ArrayList<>();
        correlativasParadigmas.add(historia);
        correlativasParadigmas.add(discretas);
        paradigmas.setCorrelativas(correlativasParadigmas);

        List<Materia> correlativasHistoria = new ArrayList<>();
        correlativasHistoria.add(disenioSistmeas);
        correlativasHistoria.add(arquitectura);
        historia.setCorrelativas(correlativasHistoria);

        List<Materia> correlativasDiscretas = new ArrayList<>();
        correlativasDiscretas.add(ingles);
        discretas.setCorrelativas(correlativasDiscretas);


        //MATERIAS APROBADAS
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);
        materiasAprobadas.add(literatura);
        materiasAprobadas.add(ingles);


        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();
        materiasParaInscribirse.add(matematica);
        materiasParaInscribirse.add(discretas);

        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertTrue(elias.getEstadoInscripcion());
    }

//LANZA UNA EXCEPCION CUANDO NO SE LE PASAN MATERIAS PARA INSCRIBIRSE AL ALUMNO
    @Test
    public void alumnoInscriptoSinMaterias(){
        Materia matematica = new Materia("Matemática", null);
        Materia historia = new Materia("Historia", null);
        Materia literatura = new Materia("Literatura", null);

        //CORRELATIVAS
        List<Materia> correlativasMatematica = new ArrayList<>();
        correlativasMatematica.add(historia);
        correlativasMatematica.add(literatura);
        matematica.setCorrelativas(correlativasMatematica);

        //MATERIAS APROBADAS
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(historia);
        materiasAprobadas.add(literatura);



        Alumno elias = new Alumno("Elias", materiasAprobadas);
        elias.setMateriasAprobadas(materiasAprobadas);

        List<Materia> materiasParaInscribirse = new ArrayList<>();



        elias.inscirbirse(materiasParaInscribirse);
        Assert.assertTrue(elias.getEstadoInscripcion());
    }



}







