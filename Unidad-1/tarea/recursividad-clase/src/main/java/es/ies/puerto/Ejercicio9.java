package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

    public static void main(String[] args) {
        List<Integer>list=serieNumeros(5,274);
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static List<Integer> serieNumeros(int numero, int contador){
        List<Integer> lista=new ArrayList<>();
        lista.add(numero);
        if (contador>1){
            lista.addAll(serieNumeros((numero+(int)(10*Math.random())), contador-1));
        }
        return  lista;
    }
}
