import ies.puerto.Ejercicio5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5= new Ejercicio5();

    @Test
    public void buscarOk(){
        int valores[]={7,8,3,4,2};
        boolean resultado= ejercicio5.buscar(valores, 3);
        boolean resultadoOk=true;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}

