package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    //Desarrolla un programa que convierta un número entero a su
    //representación binaria utilizando métodos de la clase Integer.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiera convertir en binario");
        int numero=sc.nextInt();sc.nextLine();
        System.out.println("El numero "+numero+" en binario es: "+transformaraBinario(numero));
    }

    public static String transformaraBinario(int numero) {
        String binaryString = Integer.toBinaryString(numero);
        return binaryString;
    }
}
