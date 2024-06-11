package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("¿Cuantas notas vas a introducir?");
        int notaaponer=scanner.nextInt();scanner.nextLine();
        int resultado=0;
        for (int i = 0; i <notaaponer ; i++) {
            System.out.println("Introduzca la nota "+(i+1));
            resultado+=scanner.nextInt();scanner.nextLine();
        }
        resultado=resultado/notaaponer;
        System.out.println("La media del alumno es: "+resultado);
    }
}