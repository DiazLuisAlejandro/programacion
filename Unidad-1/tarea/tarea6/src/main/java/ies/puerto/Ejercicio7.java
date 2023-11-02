package ies.puerto;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir = sc.nextInt();
        double valores[] = new double[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array");
            valores[i] = sc.nextInt();
        }
        System.out.println(arrayToString(ordenar(valores)));

    }

    public static String arrayToString(double[] valores) {
        String resultado="";
        for (int i = 0; i < valores.length; i++) {
                resultado+=""+valores[i]+",";
        }
        return resultado;
    }

    public static double[] ordenar(double[] valores) {
        double[]copia=copiarMatriz(valores);
        for (int i = copia.length-1; i >= 0; i--) {
            double minimo = copia[i];
            double aux = copia[i];
            for (int j = i; j >= 0; j--) {
                if (minimo < copia[j]) {
                    minimo = copia[j];
                    aux = copia[j];
                    copia[j] = copia[i];
                    copia[i] = aux;
                }

            }
        }

        return copia;
    }

    public static double[] copiarMatriz(double[] valores){
        double[]copia= new double[valores.length];
        for (int i = 0; i < valores.length; i++) {
            copia[i]=valores[i];

        }


        return copia;
    }

}
