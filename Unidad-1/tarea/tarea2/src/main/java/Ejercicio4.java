import java.util.Scanner;

/**
 * @author Diaz Luis Alejandro
 */
public class Ejercicio4 {
    /**
     * Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un numero y te dire si es par o impar");
        int valorN = leer.nextInt();
        if (valorN%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
