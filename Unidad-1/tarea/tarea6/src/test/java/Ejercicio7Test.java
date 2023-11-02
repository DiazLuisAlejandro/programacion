import ies.puerto.Ejercicio7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {

    Ejercicio7 ejercicio7=new Ejercicio7();

    @Test
    public void ordenarOK(){
        double valores[]={7,8,3,4,2};
        String resultado= ejercicio7.arrayToString(ejercicio7.ordenar(valores));
        String resultadoOk="2.0,3.0,4.0,7.0,8.0,";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
