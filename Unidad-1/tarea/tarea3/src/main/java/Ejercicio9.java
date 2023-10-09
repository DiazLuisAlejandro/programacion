import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio9 {
    
    /**
     * Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Introduzca el numero de que quiera calcular las tablas");
        int tabla=read.nextInt();
        int maximomultiplo=10;
        System.out.println("-----------------------------");
        for (int i = 0; i <= maximomultiplo; i++) {
            System.out.println(tabla+" x "+i+" = "+(tabla*i));
        }
    }
}
