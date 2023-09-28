/**
 * @author Diaz Luis Alejandro
 */
import java.util.Scanner;
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
            System.out.println("Introduzca el valor B");
            valorB=lectura.nextInt();
            System.out.println("Introduzca el valor C");
            valorC=lectura.nextInt();
            if ((valorA==valorB)||(valorA==valorC)||(valorB==valorC)){
                System.out.println("Uno de los valores se repiten");
            }else {
                bucle=false;
            }
        }while (bucle);
        if (valorA > valorB & valorA> valorC){
            System.out.println("El valor de A es el mayor y es: "+valorA);
        } else if (valorB>valorA & valorB>valorC) {
            System.out.println("El valor de B es el mayor y es: "+valorB);
        } else if (valorC>valorB & valorC>valorA) {
            System.out.println("El valor de C es el mayor y es: "+valorC);
        }
        if (valorA < valorB & valorA < valorC){
            System.out.println("El valor de A es el menor y es: "+valorA);
        } else if (valorB<valorA & valorB<valorC) {
            System.out.println("El valor de B es el menor y es: "+valorB);
        } else if (valorC<valorB & valorC<valorA) {
            System.out.println("El valor de C es el menor y es: "+valorC);
        
    }
}
}
