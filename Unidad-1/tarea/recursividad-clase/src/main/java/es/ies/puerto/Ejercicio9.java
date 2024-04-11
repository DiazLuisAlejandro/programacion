package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

    public List<Integer> serieNumeros(int numero, int contador){
        List<Integer> lista=new ArrayList<>();
        lista.add(numero);
        if (contador>0){
            lista.addAll(serieNumeros((numero+(int)(10*Math.random())), contador-1));
        }
        return  lista;
    }
}
