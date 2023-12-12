import ies.puerto.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Ejercicio1test {

    Ejercicio1 ejercicio1= new Ejercicio1();

    @Test
    public void invertirOK(){
        String testear="Susanita tiene un raton chiquitin que come chocolate, turron y bolitas de anis";
        String resultado=Ejercicio1.invertir(testear);
        String resultadoEsperado="sina ed satilob y norrut ,etalocohc emoc euq nitiuqihc notar nu eneit atinasuS";
        Assertions.assertEquals(resultadoEsperado,resultado);
    }

}
