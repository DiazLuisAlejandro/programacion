package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileJsonTest {
    List<Persona> personas;
    FileCsv fileCsv;

    @BeforeEach
    public void beforeEach(){
        personas=fileCsv.obtenerPersonas();
    }
    @Test
    public void obtenerPersonaTest(){
        Persona personaBuscar=new Persona(2);

        Assertions.assertEquals(personaBuscar.getId(),2, "No se ha obtenido el valor esperado");
        Assertions.assertTrue(personaBuscar.getEdad()>0, "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getNombre(), "No se ha obtenido el valor esperado");
        Assertions.assertNotNull(personaBuscar.getEmail(), "No se ha obtenido el valor esperado");

    }
    @Test
    public void addPersonaTest(){
        String nombreInsertar="otro";
        int edadInsertar=99;
        String emailInsertar="otro@email.com";
        int numPersonas=personas.size();
        Persona personaInsertar=new Persona(5,nombreInsertar,edadInsertar,emailInsertar);
        fileCsv.addPersona(personaInsertar);
        personas=fileCsv.obtenerPersonas();
        int numPersonasInsertar=personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar),"No se ha añadido a la persona");
        Assertions.assertEquals(numPersonas+1, numPersonasInsertar,"No se ha obtenido el numero esperado");
    }
}
