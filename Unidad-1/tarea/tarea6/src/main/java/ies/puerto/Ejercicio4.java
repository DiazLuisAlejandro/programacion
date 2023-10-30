package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir=sc.nextInt();
        int valores[]= new int[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del array");
            valores[i]=sc.nextInt();
        }
        String pares=pares(valores);

        System.out.println(pares);
    }

    /**
     * Te busca los numeros pares
     * @param valores Los numeros en los que busca
     * @return Devuelve un String con los numeros pares del array
     */
    public static String pares(int[] valores) {
        String pares="Los pares son: ";
        for (int i = 0; i < valores.length; i++) {
            if(valores[i]%2==0){
                pares+=""+valores[i]+"; ";
            }
        }
        return pares;
    }
}
