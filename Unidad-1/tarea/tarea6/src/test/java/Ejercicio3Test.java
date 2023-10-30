import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3= new Ejercicio3();
    @Test
    public void mayorOK(){
        double valores[]={7,8,3,4,2};
        double resultado= ejercicio3.mayor(valores);
        double resultadoOk=8;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }

    @Test
    public void menorOK(){
        double valores[]={7,8,3,4,2};
        double resultado= ejercicio3.menor(valores);
        double resultadoOk=2;
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}
