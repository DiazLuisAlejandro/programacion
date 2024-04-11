package es.ies.puerto;

public class Ejercicio4 {

    public static void main(String[] args) {
        fibonacci(2,10);
    }

    public static int fibonacci(int i, int j){
        int resultado=i;

        System.out.println(resultado);

        if (j>0) {
            resultado += fibonacci(i + resultado, j - 1);
        }


        return resultado;
    }
}
