import ies.puerto.Ejercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4= new Ejercicio4();

    @Test
    public void paresOk(){
        int valores[]={7,8,3,4,2};
        String resultado= ejercicio4.pares(valores);
        String resultadoOk="Los pares son: 8; 4; 2; ";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
