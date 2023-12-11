package ies.puerto;

public class Ejercicio2 {
    //Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada.
    //(Convina lo aprendido).

    public static void main(String[] args) {
        String telefonosAExtraer="Mi numero de telefono es +34-698-54-56-20 y el de mi madre +34-662-02-08-99";
        String []telefonos=telefonosAExtraer.split(" \\+[0-9]{2}-[0-9]{3}-0-9]{2}-0-9]{2}-0-9]{2}$");
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println(telefonos[i]);
        }
    }
}
