package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    //Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla.
    //Maneja la excepción ArithmeticException u otra excepción adecuada.

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introdusca el primer numero de la operacion");

        try {
            int num1=sc.nextInt();
        }catch (InputMismatchException inputMismatchException){
            throw new Exception ("El valor no es un int");
        };

    }

}
