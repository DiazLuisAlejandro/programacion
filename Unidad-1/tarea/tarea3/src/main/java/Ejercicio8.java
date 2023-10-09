import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio8 {

    /**
     * Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int lowerLimit=0;
        int upperLimit=0;
        int result=0;

        System.out.println("Introduce the lower limit");
        lowerLimit=read.nextInt();
        System.out.println("Introduce the upper limit");
        upperLimit=read.nextInt();

        for (int i = lowerLimit; i <=upperLimit ; i++) {
            result=0;
            for (int j = 0; j < i; j++) {
                if (i %j ==0){
                    result+=j;
                }
            }
            if (result == i) {
                System.out.println("This number: " + result + " is a perfect number");
            }
        }
    }
}
