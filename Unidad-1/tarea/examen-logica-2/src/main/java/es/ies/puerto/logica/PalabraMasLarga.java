package es.ies.puerto.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalabraMasLarga {

    public String metodoTradicional(List<String> palabras) {
        String palabraMasLarga="";
        if (palabras==null || palabras.isEmpty()){
            return null;
        }
        for (int i = 0; i < palabras.size(); i++) {
                if (palabraMasLarga.length() < palabras.get(i).length()) {
                    palabraMasLarga = palabras.get(i);
                }
            }
            return palabraMasLarga;
    }

    public String metodoRecursivo(List<String> palabras) {
        String palabraMasLarga="";

        if (palabras==null || palabras.isEmpty()){
            return null;
        }
        if (!palabras.isEmpty()){
            palabraMasLarga=palabras.get(0);

            if (palabras==null){
                return palabraMasLarga;
            }
        }
        if(palabras.size()==1){
            return palabraMasLarga;
        }

        if (palabraMasLarga.length()<palabras.get(1).length()){
            palabraMasLarga=palabras.get(1);
            palabras.remove(0);
            palabraMasLarga=metodoRecursivo(palabras);
        }else{
            palabras.remove(1);
            palabraMasLarga=metodoRecursivo(palabras);
        }

        return palabraMasLarga;
    }
}
