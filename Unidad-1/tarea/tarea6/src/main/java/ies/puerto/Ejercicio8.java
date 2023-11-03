package ies.puerto;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir = sc.nextInt();
        int valores[] = new int[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1) + " del array");
            valores[i] = sc.nextInt();
        }
        String solucion=arrayToString(eliminarDuplicados(valores));
        System.out.println(solucion);

    }

    public static int[] eliminarDuplicados(int[] valores){
        boolean duplicado=false;
        for (int i = 0; i < valores.length; i++) {
            duplicado=buscar(valores, valores[i]);
            if(duplicado){
                valores[i]=(int)Math.random()*10;
            }

        }
        return valores;
    }


    public static String arrayToString(int[] valores) {
        String resultado="";
        for (int i = 0; i < valores.length; i++) {
            resultado+=""+valores[i]+",";
        }
        return resultado;
    }


    public static boolean buscar(int[] valores, int valorBuscar) {
        boolean buscar=false;
        int i=valores.length-1;
        while (i>0 && !buscar){
            if (valorBuscar==valores[i]){
                buscar=true;
            }
            i--;
        }
        return buscar;
    }

}
