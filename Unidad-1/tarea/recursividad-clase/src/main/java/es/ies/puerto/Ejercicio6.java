package es.ies.puerto;

public class Ejercicio6 {

    public double potencia(double i,double j) throws RuntimeException {
        double resultado=i;
        if(j==0&&i==0){
            throw new RuntimeException();
        }

        if (j==0){
            return 1;
        }
        if (j>1){
            double b=potencia(i, j-1);
            resultado*=b;
        }

        return resultado;
    }
}
