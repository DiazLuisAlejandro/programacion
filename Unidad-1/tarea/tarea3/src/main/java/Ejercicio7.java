import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */

public class Ejercicio7 {
    /**
     *Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
     *El día a verificar se debe de pedir por teclado.
     * @param args
     */
         
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
     
        int dia=0;
        
            System.out.println("Introduzca el dia de la semana");
            dia=read.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");                   
                    break;
                 case 7:
                    System.out.println("Domingo");

                    break;
                default:
                    System.out.println("No existe ese dia");
                    break;
            }
        
    }
}
