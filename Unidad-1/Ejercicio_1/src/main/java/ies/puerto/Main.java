package ies.puerto;

import java.util.Scanner;

/**
 * Clase que have el ejercicio numero 1
 */
public class Main {
    public static void main(String[] args) {

        // Bloque 1: Pide dos valores por pantalla y asigna valor
        // Bloque 2: Verifica si son iguales los valores
        // Bloque 3: Verifica si A>B
        // Bloque 4: Muestra  el resultado
        Scanner lectura = new Scanner(System.in);
        int valorA, valorB;
        boolean bucle=true;
        do{
            System.out.println("Introduzca el valor de A");
            valorA=lectura.nextInt();lectura.nextLine();
            System.out.println("El valor de A es: "+valorA);
            System.out.println("Introduzca el valor de B");
            valorB=lectura.nextInt();lectura.nextLine();
            System.out.println("El valor de B es: "+valorB);
            if ( valorA == valorB ){
                System.out.println("Los valores de A ( "+valorA+" ) y B( "+valorB+" ) son iguales. Tendra que volver a introducirlo");
            } else if ( valorA > valorB ) {
                System.out.println("B( "+valorA +" ) es mayor que A( " +valorB+" )");
                bucle=false;
            }else{
                System.out.println("B ( "+valorB + ") es mayor que A( " +valorA+" )");
                bucle=false;
            }
        }while (bucle);

    }

}