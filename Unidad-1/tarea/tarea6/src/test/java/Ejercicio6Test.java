import ies.puerto.Ejercicio6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6= new Ejercicio6();

    @Test
    public void transponerOk(){
        int valores[][]=new int[3][3];
        int contar=1;
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                valores[i][j]=contar++;
            }
        }
        String resultado= ejercicio6.matrizToString(ejercicio6.transponerMatriz(valores));
        String resultadoOk="1,4,7,\n" +
                           "2,5,8,\n" +
                           "3,6,9,\n";
        Assertions.assertEquals(resultado, resultadoOk, "No es correcto");
    }
}

