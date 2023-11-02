package ies.puerto;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr en X?");
        int valorIntroducirX=sc.nextInt();
        System.out.println("¿Cuantos valores quieres introduicr en Y?");
        int valorIntroducirY=sc.nextInt();
        int valores[][]= new int[valorIntroducirX][valorIntroducirY];
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length; j++) {
                System.out.println("Introduzca el valor "+(i+1)+","+(j+1)+" del array");
                valores[i][j]=sc.nextInt();
            }
        }
        String visualizar=matrizToString(valores);
        System.out.println(visualizar);
        System.out.println("-----------------");
        String resultado=matrizToString(matrizDiagonal(valores));
        System.out.println(resultado);

    }
    public static String matrizToString(int[][] matriz) {
        String resultado="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                resultado+=""+matriz[i][j]+",";
            }
            resultado+="\n";
        }
        return resultado;
    }

    public static int[][] matrizDiagonal(int[][] matriz){
        int [][]copia=copiarMatriz(matriz);
        int valorAux1=0;
        int valorAux2=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {

                if (i!=j){
                    copia[i][j]=0;
                }
            }

        }

        return copia;
    }

    public static int[][] copiarMatriz(int[][] matriz){
        int[][]copia= new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                copia[i][j]=matriz[i][j];
            }
        }


        return copia;
    }
}
