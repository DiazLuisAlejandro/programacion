package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir=sc.nextInt();
        int valores[]= new int[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del array");
            valores[i]=sc.nextInt();
        }
        System.out.println("¿Que valor quieres buscar?");
        int valorBuscar=sc.nextInt();
        boolean buscado=buscar(valores,valorBuscar);

        System.out.println(buscado);
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
