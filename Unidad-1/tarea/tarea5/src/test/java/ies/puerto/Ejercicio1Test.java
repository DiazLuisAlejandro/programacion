package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1= new Ejercicio1();

    @Test
    public void  calcularSueldoHorasOKTest(){
        int resultado=ejercicio1.calcularSueldoHoras(10);
        int resultadoOk=100;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
