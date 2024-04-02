package domains;

import java.util.ArrayList;
import java.util.List;



public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    private Boolean estadoInscripcion ;

//METODOS

    public void inscirbirse(List<Materia> materias) {
        if(materias.isEmpty()){
            throw new RuntimeException("No hay materias para inscribirse");
        }
        Inscirpcion inscirpcion = new Inscirpcion();
        estadoInscripcion= inscirpcion.evaluarInscripcion(this.materiasAprobadas,materias);

    }

    public Alumno(String nombre,List<Materia> materiasAprobadas ) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }


//GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Boolean getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(Boolean estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }
}
