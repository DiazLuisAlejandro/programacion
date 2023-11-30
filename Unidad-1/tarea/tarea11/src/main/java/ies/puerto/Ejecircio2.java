package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejecircio2 {

    //Desarrollar un programa que formatee la fecha actual en el formato "dd-MM-yyyy HH:mm:ss"
    // utilizando la clase SimpleDateFormat de DateFormat.

    public static void main(String[] args) {
        Calendar fechaActual=Calendar.getInstance();
        SimpleDateFormat fechaFormateada=new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        int anho=fechaActual.get(Calendar.YEAR);
        int dia=fechaActual.get(Calendar.DAY_OF_MONTH);
        int mes=fechaActual.get(Calendar.MONTH);
        int hora=fechaActual.get(Calendar.HOUR_OF_DAY);
        int segundo=fechaActual.get(Calendar.SECOND);
        int minuto=fechaActual.get(Calendar.MINUTE);
        String fechapreformato=(dia+"-"+mes+"-"+anho+" "+hora+":"+minuto+":"+segundo);
        System.out.println(fechapreformato);
    }
}
