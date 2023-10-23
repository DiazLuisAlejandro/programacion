package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2=new Ejercicio2();

    @Test
    public void  posNegParImparOKTestPP(){
        String resultado=ejercicio2.posNegParImpar(10);
        String resultadoOk="Es positivo y par";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
    @Test
    public void  posNegParImparOKTestPI(){
        String resultado=ejercicio2.posNegParImpar(9);
        String resultadoOk="Es positivo e impar";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
    @Test
    public void  posNegParImparOKTestNP(){
        String resultado=ejercicio2.posNegParImpar(-10);
        String resultadoOk="Es negativo y par";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }

    @Test
    public void  posNegParImparOKTestNI(){
        String resultado=ejercicio2.posNegParImpar(-9);
        String resultadoOk="Es negativo e impar";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
