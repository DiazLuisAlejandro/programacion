package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {

    //Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto
    // y luego intente convertirla a un objeto Date. Maneja la excepción ParseException.

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Introduzca la fecha que quiera. Ejemplo (10/11/2024)");
        String fechaString=sc.nextLine();
        try {
            dateFormat.parse(fechaString);
        }catch (ParseException parseException){
            throw new Exception("La fecha se introdujo de forma incorrecra");
        }
    }

}
