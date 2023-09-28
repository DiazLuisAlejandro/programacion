/**
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.
 * Utiliza un bucle __for__ y un bucle __while__.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int resultadoFor=0;
        for (int i = 1; i <= 10; i++) {
            resultadoFor+=i;
        }
        System.out.println("El resultado del bucle for es: "+resultadoFor);
        int resultadoWhile=0;
        int contador=1;
        while (contador<=10){
            resultadoWhile+=contador;
            contador++;
        }
        System.out.println("El resultado del bucle while es: "+resultadoWhile);
    }
}
