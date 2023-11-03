package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        int []array1=crearArray();
        int []array2=crearArray();




    }





    public static int[] crearArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir = sc.nextInt();
        int valores[] = new int[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array");
            valores[i] = sc.nextInt();
        }
        return valores;
    }

    public static int[] ordenar(int[] valores) {
        int[]copia=copiarArray(valores);
        for (int i = copia.length-1; i >= 0; i--) {
            int minimo = copia[i];
            int aux = copia[i];
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

    public static int[] copiarArray(int[] valores){
        int[]copia= new int[valores.length];
        for (int i = 0; i < valores.length; i++) {
            copia[i]=valores[i];

        }


        return copia;
    }

    public static int[]combinarArrays(int[] valores1,int[] valores2){

    }
}
