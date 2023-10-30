package ies.puerto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos valores quieres introduicr?");
        int valorIntroducir=sc.nextInt();
        double valores[]= new double[valorIntroducir];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduzca el valor "+(i+1)+" del array");
            valores[i]=sc.nextDouble();
        }
        double mayor=mayor(valores);
        double menor=menor(valores);
        System.out.println("El mayor es "+mayor+" y el menor es "+menor);
    }


    /**
     * Busca el numero menor
     * @param valores Numeros en los que busca
     * @return El valor menor
     */
    public static double menor(double[] valores) {
        double menor=valores[1];
        double temp=0;
        for (int i = 0; i < valores.length ; i++) {
            temp=valores[i];
            if (temp<menor){
                menor=temp;
            }
        }
        return menor;
    }

    /**
     * Busca el numero mayor
     * @param valores Numeros en los que busca
     * @return El valor mayor
     */
    public static double mayor(double[] valores) {
        double mayor=valores[1];
        double temp=0;
        for (int i = 0; i < valores.length ; i++) {
            temp=valores[i];
            if (temp>mayor){
                mayor=temp;
            }
        }
        return mayor;
    }
}
