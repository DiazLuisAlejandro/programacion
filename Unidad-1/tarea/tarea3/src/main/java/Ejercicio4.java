import java.util.Scanner;

/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio4 {

    /**
     * Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Introduzca un numero y te digo si es un palindromo, preferiblemente de mas de 2 digitos");
        Scanner scanner=new Scanner(System.in);
        boolean esOno=false;
        String cadena=scanner.nextLine();
        if (cadena == null || cadena.isEmpty()) {
            esOno=false;
        }else{
        cadena = cadena.replaceAll("\\s+", "").toLowerCase();
        int inicio = 0;
        int fin = cadena.length() - 1;
            while (inicio < fin) {
                if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                    esOno=false;
                }else{
                    esOno=true;

                }
                inicio++;
                fin--;
            }
        }

        if (esOno){
            System.out.println("Es un palindromo");
        }else {
            System.out.println("No es un palindromo");
        }


    }
    
}
