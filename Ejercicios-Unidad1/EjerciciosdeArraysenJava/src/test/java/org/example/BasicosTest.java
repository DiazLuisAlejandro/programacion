package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicosTest {

    Basicos basicos;
    private final int[] arrayi = {1, 2, 3, 4, 5};

    private final float[] arrayf = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};

    @BeforeEach
    public void BeforeEach(){
        basicos =new Basicos();
    }


    @Test
    public void SumarTest(){
        Assertions.assertEquals("La suma de los elementos es: "+15, basicos.Sumar(arrayi));
    }

    @Test
    public void MediaTest(){
        Assertions.assertEquals("El promedio es: "+3.5, basicos.Media(arrayf));
    }

    @Test
    public void MayoryMenorTest(){
        Assertions.assertEquals("El numero mayor es: 5 y el numero menor es: 1", basicos.MayoryMenor(arrayi));
    }

    @Test
    public void ParesTest(){
        Assertions.assertEquals("Los pares son: 2;4;", basicos.pares(arrayi));
     }

    @Test
    public void BuscarMayorTest(){
        Assertions.assertEquals( "El valor 3 se encuntra en el Array", basicos.buscarValor(arrayi,3));
        Assertions.assertEquals( "El valor 6 no se encuntra en el Array", basicos.buscarValor(arrayi,6));
    }
}
