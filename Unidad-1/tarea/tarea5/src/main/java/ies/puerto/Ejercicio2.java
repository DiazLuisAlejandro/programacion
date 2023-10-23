package ies.puerto;

public class Ejercicio2 {

    public String posNegParImpar(int numero){
        String resultado="";
        if (numero<0){
            resultado+="Es negativo ";
        }else{
            resultado+="Es positivo ";
        }
        if (numero%2==0){
            resultado+="y par";
        }else{
            resultado+="e impar";
        }
        return resultado;
    }
}
