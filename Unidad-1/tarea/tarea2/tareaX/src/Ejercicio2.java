/**
 * @author Diaz Luis Alejandro
 */
public class Ejercicio2 {

    /**
     * Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
     * El algoritmo debe imprimir cual es el mayor y cual es el menor.
     * Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos.
     * Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales
     * @param args
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int valorA, valorB, valorC;
        boolean bucle=true;
        do{
            System.out.println("Introduzca el valor A");
            valorA=lectura.nextInt();
        }while (bucle)
    }
}