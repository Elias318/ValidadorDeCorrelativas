package domains;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Inscirpcion {
    private Materia nomMateria;
    private Boolean aprobada;


    public Boolean evaluarInscripcion(List<Materia> materiasAprobadas, List<Materia> materiasAInscribirse) {
        List <Materia> correlativasTotales = materiasAInscribirse
                .stream()
                .flatMap((m->m.getCorrelativas().stream()))
                        .collect(Collectors.toList());
            setAprobada(new HashSet<>(materiasAprobadas).containsAll(correlativasTotales));
            return this.aprobada;



    }

    //GETTERS AND SETTERS

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = aprobada;
    }
}
