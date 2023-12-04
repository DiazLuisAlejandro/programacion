package ies.puerto;

public class Ejercicio1 {
    //Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando expresiones regulares.

    public static void main(String[] args) {
        String correo="alhahfjgjsjgs2@gmail.com";

        boolean correoCorrecto=correo.matches("^[a-z0-9]*@[a-z]*\\.([a-z]{2}|[a-z]{3})");
        System.out.println(correoCorrecto);
    }

}
