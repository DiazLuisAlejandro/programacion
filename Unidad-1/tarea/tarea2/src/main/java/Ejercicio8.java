import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio8 {
    /**
     * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el numero de notas a adjutar");
        int notas=leer.nextInt(); leer.nextLine();
        int valortotal=0;
        for (int i = 1; i <= notas; i++) {
            System.out.println("Intrduzca la nota "+i);
            valortotal+=leer.nextInt();
        }
        System.out.println("La media es: "+valortotal/notas);
    }
}
