package ies.puerto;

public class Ejercicio2 {
    //Desarrolla un programa que cuente el número de vocales en una cadena de texto
    public static void main(String[] args) {
        String cadenaContar="Susanita tiene un raton chiquitin que come chocolate, turron y bolitas de anis";

        int vocalesContar=contadorVocales(cadenaContar);
        System.out.println("Hay "+vocalesContar+" vocales");
    }

    public static int contadorVocales(String cadenaContar) {
        String []vocales=cadenaContar.split("[aeiou]");
        int contador=0;
        for (int i = 0; i < vocales.length; i++) {
            contador++;
        }
        return contador;
    }
}
