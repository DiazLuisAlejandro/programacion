package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppPersona {

    static List<Persona> miListaPersonas;
    static Persona ramon;
    static Persona juan;

    static String dni1="12345678T";

    static String dni2="11111111H";

    public static void main(String[] args) {
        ramon=new Persona(dni1,"Ramon", "Gonzalez", "Perez");
        juan=new Persona(dni2, "Juan", "Gonzalez", "Perez");
        miListaPersonas=new ArrayList<>();
        miListaPersonas.add(ramon);
        miListaPersonas.add(juan);
        System.out.println(miListaPersonas);
        Persona ramon2 = new Persona(dni1, "Ramon", "Gonzalez", "Perez");

        if (miListaPersonas.contains(ramon2)){
            System.out.println("Ramon2 existe");
        }
    }
}
