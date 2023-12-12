import ies.puerto.Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2test {
    Ejercicio2 ejercicio2= new Ejercicio2();

    @Test
    public void contarOK(){
        String ejemplo="Hay cinco vocales y son a, e, i, o, u";
        int resultado=Ejercicio2.contadorVocales(ejemplo);
        int resultadoEsperado=12;
        Assertions.assertEquals(resultadoEsperado,resultado);
    }

}
