package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    //Implementa un programa que calcule y muestre la suma de los dígitos de un número entero

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el primer valor de la suma");
        int num1=sc.nextInt();sc.nextLine();
        int num2= sc.nextInt();sc.nextLine();

        System.out.println(sumar(num1,num2));
    }

    public static String sumar(int num1, int num2) {
        int resultado=num1+num2;
        String suma=(num1+" + "+num2+" = "+resultado);
        return suma;
    }
}
