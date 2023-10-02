import java.util.Scanner;

/**
 * @author Alejanddo Diaz Luis
 */
public class Ejercicio6 {

    /**
     *Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Deme un numero entero y te dire si es primo");
        int numeroValorar=leer.nextInt();
        if (calcularPrimo(numeroValorar)){
            System.out.println("El numero "+numeroValorar+" es primo");
        }else{
            System.out.println("El numero "+numeroValorar+" no es primo");
        }
    }

    /**
     * Calcula si es primo o no
     * @param numeroValorar
     * @return si o no
     */
    public static boolean calcularPrimo(int numeroValorar){
        boolean esprimo=true;
        int contardivisores=0;
        for (int i = 1; i <=numeroValorar ; i++) {
            if ((numeroValorar % i)==0){
                contardivisores++;
                if (contardivisores>2){
                    esprimo=false;
                    i=numeroValorar+1;
                }
            }
        }
        return esprimo;
    }
}
