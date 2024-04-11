package es.ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<Integer> resultado=fibonacci(0,1,20);
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i));
        }
    }

    public static List<Integer> fibonacci(int i, int j, int k){
        int resultado=i+j;
        List<Integer> lista=new ArrayList<>();
        if(i==0 && j==1){
            k-=2;
            lista.add(i);
            lista.add(j);
        }
        lista.add(resultado);


        if (k>0) {
            lista.addAll( fibonacci(j, resultado,k-1));
        }


        return lista;
    }
}
