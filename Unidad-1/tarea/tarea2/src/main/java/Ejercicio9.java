/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio9 {
    /**
     * Muestra los números del 1 al 100 (ambos incluidos).
     * Usa un bucle while y un bucle for.
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        do {
            i++;
            System.out.print(i+"; ");
        }while(i<=99);
        System.out.println();
        for (int j = 1; j <= 100; j++) {
            System.out.print(j+"; ");
        }
    }
}
