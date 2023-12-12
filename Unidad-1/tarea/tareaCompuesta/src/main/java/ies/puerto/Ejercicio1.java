package ies.puerto;

public class Ejercicio1 {
    //Ejercicio 1: Implementa un programa que invierta una cadena de texto dada.
    //La cadena debe de tener al menos 10 caracteres no vacíos. 
    //Puntuación 1 punto. (Con test que verifique el comportamiento 1,25)

    public static void main(String[] args) {
        String ejemplo="I want to see the 2030 worlds cup finals becauese it's in Spain";

        String invertido=invertir(ejemplo);

        System.out.printf(invertido);

    }

    public static String invertir(String ejemplo) {
        char ejemploArray[]=ejemplo.toCharArray();
        String inverso="";
        for (int i = ejemploArray.length-1; i >= 0; i--) {
            inverso+=ejemploArray[i];
        }
        return inverso;
    }


}
