package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonaTest extends UtilidadClass {

    int id=1;

    String nombre="nombre";
    int edad=12;
    String email="test@test.com";

    Persona persona;



    @BeforeEach
    public void befoereEach(){
        persona =new Persona(id,nombre,edad,email);

    }

    @Test
    public void createPersonaTest(){
        Assertions.assertNotNull(persona,"El objeto no puede ser nulo");
    }

    @Test
    public void toStringPersonaTest(){
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(nombre)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(email)),"El resultado no es el esperado");
    }


    @Test
    public void toCSVPersonaTest(){
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(nombre),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(email),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(DELIMITADOR),"El resultado no es el esperado");
    }
}
