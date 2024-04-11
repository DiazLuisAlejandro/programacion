package es.ies.puerto;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println(sumaNaturales(10));
    }

    private static int sumaNaturales(int numero) {
        int resultado=numero;
        if (numero>0){
            resultado+=sumaNaturales(numero-1);
        }
        return resultado;
    }

}
