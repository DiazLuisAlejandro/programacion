import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio5 {
    /**
     * Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca dos numeros y los ordeno de menor a mayor");
        System.out.println("Primer numero");
        int valorUno=leer.nextInt(); leer.nextLine();
        System.out.println("Segundo numero");
        int valorDos= leer.nextInt(); leer.nextLine();
        if (valorUno<valorDos){
            System.out.println("El menor es: "+valorUno+" y el mayor es: "+valorDos);
        }else{
            System.out.println("El menor es: "+valorDos+" y el mayor es: "+valorUno);
        }
    }
}
