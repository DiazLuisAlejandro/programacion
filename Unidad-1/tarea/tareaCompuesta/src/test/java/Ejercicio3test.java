import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3test {

    Ejercicio3 ejercicio3= new Ejercicio3();

    @Test
    public void sumarOK(){
        int num1=7;
        int num2=13;
        String resultado=Ejercicio3.sumar(num1,num2);
        String resultadoEsperado="7 + 13 = 20";
        Assertions.assertEquals(resultadoEsperado,resultado);
    }
}
