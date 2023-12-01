package ies.puerto;

import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Crear un programa que reste 2 meses a la fecha actual utilizando la clase Calendar.
        Calendar fechaActual=Calendar.getInstance();
        int anho=fechaActual.get(Calendar.YEAR);
        int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
        int mes=fechaActual.get(Calendar.MONTH)-2;
        String fechapreformato=(anho+"-"+mes+"-"+dia);
        System.out.println(fechapreformato);

    }
}
