package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3= new Ejercicio3();

    @Test
    public void ordenarOk(){
        String resultado= ejercicio3.sumarAscDesc(2,5,1,3,4);
        String resultadoOk="La suma de 2 5 1 3 y 4 es: 15 Y el orden de mayor a menor es: , 5, 4, 3, 2, 1";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
