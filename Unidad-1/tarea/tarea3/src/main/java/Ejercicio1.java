/**
 * @author Alejandro Diaz Luis
 */

public class Ejercicio1 {

/**
 * 1. Escribe un programa en Java que imprima el patrón siguiente:
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 
 * @param args
 */
    public static void main(String[] args) {
        int sumar=0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=i ; j++) {
                sumar+=1;

                System.out.print(sumar+" ");
            }
            System.out.println();
        }
    }
}
