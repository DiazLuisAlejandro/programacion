package es.ies.puerto;

public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


    public static int factorial(int numero){
        int resultado=numero;

        if (numero>1){
            resultado*=factorial(numero-1);
        }

        return resultado;
    }
}
