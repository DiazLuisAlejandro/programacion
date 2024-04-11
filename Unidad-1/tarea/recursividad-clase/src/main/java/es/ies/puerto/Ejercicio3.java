package es.ies.puerto;

public class Ejercicio3 {

    public static void main(String[] args) {
        imprimirPares(203);
    }

    private static void imprimirPares(int i) {
        if (i%2!=0){
            i-=1;
        }
        System.out.println(i);
        if (i>0){
            imprimirPares(i-2);
        }
    }
}
