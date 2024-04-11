package es.ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args) {
        imprimirImpares(204);
    }
    private static void imprimirImpares(int i) {
        if (i%2==0){
            i-=1;
        }
        System.out.println(i);
        if (i>0){
            imprimirImpares(i-2);
        }
    }
}
