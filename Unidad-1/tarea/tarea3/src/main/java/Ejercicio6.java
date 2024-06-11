/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio6 {
    /**
     * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000
     * @param args
     */
    public static void main(String[] args) {
        int result=0;
        int aux1=0;
        int aux2=0;
        int aux3=0;
        for ( aux1=0; aux1 <= 1000; aux1++) {
            aux2 = aux1;
            result = 0;
            while (aux2 != 0) {
                aux3 = aux2 % 10;
                result = result + aux3 * aux3 * aux3;
                aux2 /= 10;
            }
            if (result == aux1)
                System.out.println(aux1 + " es un numero de Armstrong");
        }
    }

}