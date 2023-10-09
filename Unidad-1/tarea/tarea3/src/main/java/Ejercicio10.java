import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */

public class Ejercicio10 {
    
    /**
     * Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Dime un numero y te decimos la sumatoria de los pares hasta ese");
        int sumatoria=2;
        int contador=2;
        int upperLimit= read.nextInt();
        do {
            sumatoria=contador+sumatoria;
            contador+=2;
        } while (contador<=upperLimit);
        System.out.println(sumatoria);
    }
}
