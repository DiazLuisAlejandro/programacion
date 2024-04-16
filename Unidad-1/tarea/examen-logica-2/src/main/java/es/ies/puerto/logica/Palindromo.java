package es.ies.puerto.logica;

public class Palindromo {
    public boolean palindromoTradicional(String cadena) {
        if (cadena==null|| cadena.isEmpty()){
            return false;
        }
        cadena=cadena.toLowerCase();
        cadena=cadena.replace(" ","");
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)!=cadena.charAt(cadena.length()-1-i)){
                return false;
            }

        }
        return true;
    }

    public boolean palindromoRecursivo(String cadena) {
        if (cadena==null|| cadena.isEmpty()){
            return false;
        }
        cadena=cadena.toLowerCase();
        cadena=cadena.replace(" ","");
        if (cadena.length()==1){
            return true;
        }
        if (cadena.charAt(0)==cadena.charAt(cadena.length()-1)){
            cadena=cadena.substring(1,cadena.length()-1);
            if (palindromoRecursivo(cadena)){
                return true;
            }
        }

        return false;
    }
}
