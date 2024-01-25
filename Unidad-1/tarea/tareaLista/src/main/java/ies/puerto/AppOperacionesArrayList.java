package ies.puerto;

import ies.puerto.clases.OperacionesArrayList;

public class AppOperacionesArrayList {


    public static void main(String[] args) {
        OperacionesArrayList textoejmplo =new OperacionesArrayList();
        int contador=0;
        for (String cadena:textoejmplo.loremIpsum) {
            if (cadena.matches("^[A|a].*")){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" que empiezen por A");
    }
}
