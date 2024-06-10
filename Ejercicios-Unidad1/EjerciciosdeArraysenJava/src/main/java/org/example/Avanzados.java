package org.example;


import java.util.Scanner;

public class Avanzados {

    static Basicos basicos;

    public static void main(String[] args) {
        basicos=new Basicos();
        notas();
    }

    private static void notas() {
        Scanner sc=new Scanner(System.in);
        float[]notas=new float[5];
        for (int i = 0; i <notas.length; i++) {
            System.out.println("Introduzca la nota "+(notas[i]+1));
            notas[i]= sc.nextInt();
        }
        System.out.println(basicos.Media(notas));
    }
}
