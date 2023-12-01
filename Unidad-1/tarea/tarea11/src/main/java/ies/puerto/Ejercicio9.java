package ies.puerto;

import java.util.Calendar;

public class Ejercicio9 {
    
    //Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.

    public static void main(String[] args) {
        Calendar fecha1=Calendar.getInstance();
        
        int dia=fecha1.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
    }
}
