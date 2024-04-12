package es.ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import es.ies.puerto.Ejercicio6;

public class Ejercicio6Test {
    Ejercicio6 ejercicio;

    double base=3;
    double exponente=3;
    double resultasdoEsperado=27;

    @BeforeEach
    public void beforeEach() {
        ejercicio=new Ejercicio6();
    }

    @Test
    public void ejercicio6Test() {
        double resultado=ejercicio.potencia(base,exponente);
        Assertions.assertEquals(resultasdoEsperado,resultado);
    }
}
