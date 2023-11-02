package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir = sc.nextInt();
        double valores[] = new double[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array");
            valores[i] = sc.nextInt();
        }


    }
}
