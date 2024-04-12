package es.ies.puerto;

public class Ejercicio8 {

    
    public int sumaDigitos(int i){
        int resultado=0;
        String num= String.valueOf(i);

        String[] split = num.split("");


        if (i==0){
            return resultado;
        }
        i=((i-Integer.parseInt(split[split.length-1]))/10);

        if (split.length>0){
            resultado= Integer.parseInt(split[split.length-1]);
            resultado+=sumaDigitos(i);

        }

        return resultado;
    }
}
