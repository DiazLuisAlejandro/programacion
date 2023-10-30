package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir=sc.nextInt();
        double valores[]= new double[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del array");
            valores[i]=sc.nextDouble();
        }
        double resultado=promedio(valores);
        System.out.println("La media es: "+resultado);
    }

    /**
     * Calcula la media
     * @param valores Numeros dados
     * @return Media de los números dados
     */

    public static double promedio(double valores[]){
        double resultado=0;
        for (int i = 0; i < valores.length; i++) {
            resultado+=valores[i];
        }
        resultado/=valores.length;
        return resultado;
    }
}
