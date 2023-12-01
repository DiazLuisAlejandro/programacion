package ies.puerto;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio4 {
    //Implementar un programa que sume 10 días a la fecha actual utilizando la clase Calendar.

    public static void main(String[] args) {
        
        Calendar fechaActual=Calendar.getInstance();
        int anho=fechaActual.get(Calendar.YEAR);
        int dia=fechaActual.get(Calendar.DAY_OF_MONTH)+10;
        int mes=fechaActual.get(Calendar.MONTH);
        String fechapreformato=(anho+"-"+mes+"-"+dia);
        System.out.println(fechapreformato);
    }

}
