package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir=sc.nextInt();
        double valores[]= new double[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del array");
            valores[i]=sc.nextDouble();
        }
        double resultado=sumatoria(valores);
        System.out.println("La sumatoria es: "+resultado);
    }


    /**
     * Calcula sumatoria
     * @param valores Numeros que sumar
     * @return Resultado de la sumatoria;
     */
    public static double sumatoria(double valores[]){
        double resultado=0;
        for (int i = 0; i < valores.length; i++) {
            resultado += valores[i];
        }
        return resultado;
    }

}