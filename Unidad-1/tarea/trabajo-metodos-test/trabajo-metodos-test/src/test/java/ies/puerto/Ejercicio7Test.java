package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7=new Ejercicio7();

    @Test
    public void calcularLunestestOK() {
        String resultado="";
        String resultadoOK="Lunes";
        resultado=Ejercicio7.calcularDiaSemana(1);
        Assertions.assertEquals(resultado, resultadoOK, "No es correcto");

    }
}
