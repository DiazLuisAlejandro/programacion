package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    //Crea una aplicación en Java que construya y muestre una representación gráfica de un triángulo invertido.
    //El programa debe de solicitar por teclado el número de columnas y si es menor que cuatro generar una exception indicando el error
    public static void main(String[] args) throws Exception {

        System.out.println("Introduzca el valor para la piramide");
        int base=introducirvalor();
        int altura=altura(base);
        char[][]piramide=piramide(base,altura);
        rellenar(piramide, base, altura);
        vaciar(piramide, base, altura);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base ; j++) {
                System.out.print(piramide[i][j]);

            }
            System.out.println();
        }
    }

    /**
     * Metodo que recoje los valores
     * @return
     * @throws Exception
     */

    private static int introducirvalor() throws Exception {
        Scanner sc =new Scanner(System.in);
        int valor=sc.nextInt();
        if (valor>4){
            if (valor%2==0){
                valor++;
            }else{
                valor=valor;
            }
        }else{
            throw new Exception("El valor debe ser mayor que 4");
        }

        return valor;
    }

    /**
     * Genera la altura de la piramide
     * @param base
     * @return
     */
    private static int altura(int base) {
        int altura=base/2+1;
        return altura;
    }

    /**
     * Crea el array
     * @param base
     * @param altura
     * @return
     */
    public static char[][] piramide(int base, int altura){

        char [][]piramide= new char[altura][base];

        return piramide;
    }

    /**
     * Rellena todos los huecos del array
     * @param piramide
     * @param base
     * @param altura
     */
    private static void rellenar(char[][] piramide, int base, int altura) {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base ; j++)
                piramide[i][j] = '*';
        }
    }

    /**
     * Cambia los huecos del array done hay * que no deben estar por espacios en blanco
     * @param piramide
     * @param base
     * @param altura
     */
    private static void vaciar(char[][] piramide, int base, int altura) {
        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {
                if ((i == j) && (i != 0)) {
                    piramide[i][j - 1] = ' ';
                }else if (((i != 0) && (j == (base - 1))) || ((j == 0) && (i != 0))) {
                    piramide[i][j] = ' ';
                } else if ((i==altura-1) && j!=(base/2)) {
                    piramide[i][j] = ' ';

                }

            }

        }
    }






}
