import ies.puerto.Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2= new Ejercicio2();
    @Test
    public void mediaOK(){
        double valores[]={7,8,3,4,2};
        double resultado= ejercicio2.promedio(valores);
        double resultadoOk=4.8;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
