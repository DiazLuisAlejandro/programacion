package ies.puerto;

/**
 * Calase que tiene como odjetivo realizar el calculo factorial
 * @author Alejandro Diaz Luis
 */

public class CalculoFactorial {
    public static void main(String[] args) {
        int numero=5;
        System.out.println("Calculando el factorial de "+numero+", resultado "+calculoFactorial(numero));        
    }   
    /**
     * Metodo que realiza el calculo del factorial 
     * @param numero Valor sobre el que se quiere realizar el factorial
     * @return resultado del factorial
     */
    public static int calculoFactorial(int numero){
        int resulto=1;
        for (int i = 2; i <= numero; i++) {
            resulto*=i;
        }
        return resulto;
    }
}
