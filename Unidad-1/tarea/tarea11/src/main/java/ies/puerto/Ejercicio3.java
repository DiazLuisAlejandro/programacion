package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Escribir un programa que utilice la clase Calendar para obtener y 
        //mostrar la fecha actual con los componentes separados (año, mes, día).
        Calendar fechaActual=Calendar.getInstance();
        int anho=fechaActual.get(Calendar.YEAR);
        int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
        int mes=fechaActual.get(Calendar.MONTH);
        String fechapreformato=(anho+"-"+mes+"-"+dia);
        System.out.println(fechapreformato);
    }
}
