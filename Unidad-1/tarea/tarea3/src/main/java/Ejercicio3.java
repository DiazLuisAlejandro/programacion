import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio3 {
    
    /**
     * Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduzca la posición del numero en la sucecion de Fibonacci");
        int position=read.nextInt();
        int startingPosition=0;
        int firsrPosition=1;
        int result=0;
        for (int i = 0; i <=position; i++) {
            if(i==0 ){
              if(position==i){
                    System.out.println("El numero en la posicion: "+i+" es: "+result);
                }

            }else if(i==1 ){
                if(position==i){
                    System.out.println("El numero en la posicion: "+i+" es: "+firsrPosition);
                }
            }else{
                result=firsrPosition+startingPosition;
                
                startingPosition=firsrPosition;
                firsrPosition=result;
            }
        }
        System.out.println("El numero en la posicion: "+position+" es: "+result);
    }
}
