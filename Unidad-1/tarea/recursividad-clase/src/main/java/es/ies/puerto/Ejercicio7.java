package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {


    private List<Integer> cuentaRegresiva(int i) {
        List<Integer> lista=new ArrayList<>();
        lista.add(i);
        if (i>0) {
            lista.addAll(cuentaRegresiva(i - 1));
        }
        return lista;
    }
}
