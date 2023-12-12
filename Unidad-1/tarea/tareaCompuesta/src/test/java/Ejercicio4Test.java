import ies.puerto.Ejercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Ejercicio4Test {

    Ejercicio4 ejercicio4=new Ejercicio4();

    @Test
    public void transfomarOK(){
        int ejemplo=25;
        String resultado=Ejercicio4.transformaraBinario(ejemplo);
        String resultadoEsperado="11001";
        Assertions.assertEquals(resultadoEsperado,resultado);
    }
}
