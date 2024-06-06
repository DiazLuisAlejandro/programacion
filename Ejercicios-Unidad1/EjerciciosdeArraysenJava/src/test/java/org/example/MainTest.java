package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Main main;
    private final int[] arrayi = {1, 2, 3, 4, 5};

    private final float[] arrayf = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};

    @BeforeEach
    public void BeforeEach(){
        main=new Main();
    }


    @Test
    public void SumarTest(){
        Assertions.assertEquals(main.Sumar(arrayi),"La suma de los elementos es: "+15);
    }

    @Test
    public void MediaTest(){
        Assertions.assertEquals(main.Media(arrayf),"El promedio es: "+3.5);
    }

    @Test
    public void MayoryMenorTest(){
        Assertions.assertEquals(main.MayoryMenor(arrayi),"El numero mayor es: 5 y el numero menor es: 1");
    }

     @Test
    public void ParesTest(){
        Assertions.assertEquals(main.pares(arrayi),"Los pares son: 2;4;");
     }
}
