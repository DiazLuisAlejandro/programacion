import java.util.Scanner;
/**
 * @author Aleajandro Diaz Luis
 */
public class Ejercicio2 {

    /**
     * Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.
     * @param args
     */

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Introduzca el numero 1");
        int lowerLimit=read.nextInt();
        System.out.println("Introduzca el numero 2");
        int upperLimit=read.nextInt();
        int firstValue=0;
        int secondValue=0;
        int thirdValue=0;
        int fourthValue=0;
        for (int i = 1; i <= lowerLimit; i++) {
            if(lowerLimit%i==0 && i<upperLimit){
                secondValue=firstValue;
                firstValue=i;
            }    
            for (int j = 1; j <= upperLimit; j++) {
                if(upperLimit%j==0 && firstValue==j){
                    thirdValue=fourthValue;
                    fourthValue=j;
                }   
            } 
            
            
        }
        System.out.println("El MCD es: "+fourthValue);

    }
}
