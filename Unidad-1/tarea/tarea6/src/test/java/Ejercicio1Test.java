import ies.puerto.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1= new Ejercicio1();
    @Test
    public void sumatoriaOK(){
        double valores[]={7,8,3,4,2};
        double resultado= ejercicio1.sumatoria(valores);
        double resultadoOk=24;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
