package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppLista {

    static List<Integer> miListaEnteros;

    public static void main(String[] args) {
        miListaEnteros=new ArrayList<Integer>();
        addElement(1);
        addElement(2);
        List<Integer> subLista=new ArrayList<>();
        subLista.add(3);
        subLista.add(4);
        System.out.println(miListaEnteros);
        System.out.println(subLista);
    }


    public static boolean addElement(Integer elemento){
        return miListaEnteros.add(elemento);
    }

    public static boolean removeElement(Integer elemento){
        return miListaEnteros.remove(elemento);
    }
}
