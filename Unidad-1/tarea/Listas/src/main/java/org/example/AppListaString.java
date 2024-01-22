package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {

    static List<String> miListaString;

    public static void main(String[] args) {
        String dni1="00000000H";
        String dni2="78647304T";
        miListaString=new ArrayList<>();

        miListaString.add(dni1);
        miListaString.add(dni2);
        System.out.println(miListaString);
        boolean existe=existeElemento(dni1);
        if (existe) {
            System.out.println("Existe el elemento " + dni1 + ", en la lista: " + miListaString);
        }
    }

    public static boolean existeElemento(String elemento){
        return miListaString.contains(elemento);
    }
}
