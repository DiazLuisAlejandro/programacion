package ies.puerto;

import java.util.Calendar;

public class Ejercicio7 {
    //Escribir un programa que calcule la diferencia en días entre dos fechas utilizando la clase Calendar.

    public static void main(String[] args) {
        Calendar fecha1=Calendar.getInstance();
        Calendar fecha2=Calendar.getInstance();

        int dia1=fecha1.get(Calendar.DAY_OF_YEAR);
        int dia2=fecha2.get(Calendar.DAY_OF_YEAR)+((int)(Math.random()*100));;

        int resultado=dia1-dia2;
         if (resultado<0) {
            resultado=resultado*-1;
         }
         System.out.println("Hay "+resultado+" dias de diferencia");

    }
}
