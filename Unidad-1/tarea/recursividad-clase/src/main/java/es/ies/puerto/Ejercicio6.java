package es.ies.puerto;

public class Ejercicio6 {

    public static void main(String[] args) {
        System.out.println( potencia(10,5));
    }

    private static double potencia(double i,double j) {
        double resultado=i;

        if (j>1){
            double b=potencia(i, j-1);
            resultado*=b;
        }
        if (i==0){
            return 0;
        }
        return resultado;
    }
}
