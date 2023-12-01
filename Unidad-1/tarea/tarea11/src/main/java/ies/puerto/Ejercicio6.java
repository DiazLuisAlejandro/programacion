package ies.puerto;

import java.util.Date;

public class Ejercicio6 {
    //Desarrollar un programa que compare dos fechas utilizando la clase Date y muestre si son iguales o diferentes.

    public static void main(String[] args) {
        Date fecha1= new Date();
        Date fecha2= new Date();
        if (fecha1==fecha2) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No so iguales");
        }
    }

}
