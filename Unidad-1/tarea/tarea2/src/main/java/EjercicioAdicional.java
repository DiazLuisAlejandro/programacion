import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class EjercicioAdicional {
    /**
     * Calcular numero perfectos en un rango
     * Formula: 2^(n-1))*(2^n-1)
     * @param args
     */
    public static void main(String[] args) {
        //Scanner read = new Scanner(System.in);
        //double lowerLimit=0;
        //double upperLimit=0;
        int result=0;
        int divide=0;

        //System.out.println("Introduce the lower limit");
        //lowerLimit=read.nextDouble();
        //System.out.println("Introduce the upper limit");
        //upperLimit=read.nextDouble();

        for (double i = 1; i <=1000 ; i++) {
            result=0;
            for (int j = 0; j < i; j++) {
                if (i %j ==0){
                    result+=j;
                }
            }
            if (result == i) {
                System.out.println("This number  " + result + " is a perfect number");
            }
        }
    }
}

//for (int i = num2; i > 1; i--) {
//            resultado*=num1;
//        }