package es.ies.puerto.logica;

import java.util.List;

public class Digitos {
    public  int sumaTradicional(int numero) {
        int resultado=0;
        String string= String.valueOf(numero);
        List<String> numeros= List.of(string.split(""));

        if (string.length()==1){
            return numero;
        }

        for (int i = numeros.size()-1; i >0; i--) {
            numero=(numero-Integer.parseInt(numeros.get(numeros.size()-1)))/10;
            resultado+=Integer.parseInt(numeros.get(numeros.size()-1));
        }


        return resultado;
    }

    public  int sumaRecursiva(int numero) {
        int resultado=0;
        String string= String.valueOf(numero);
        List<String> numeros= List.of(string.split(""));

        if(string.length()>1){

            numero=(numero-Integer.parseInt(numeros.get(numeros.size()-1)))/10;
            resultado=Integer.parseInt(numeros.get(numeros.size()-1))+sumaRecursiva(numero);
        }
        if (string.length()==1){
            resultado+=numero;
        }

        return resultado;
    }
}
