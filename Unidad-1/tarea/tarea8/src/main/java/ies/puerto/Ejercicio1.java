package ies.puerto;

public class Ejercicio1 {

    /**
     *
     */

    public float notaMedia(float[]array){
        float media=0;
        float sumatoria=0;
        for (int i = 0; i < array.length; i++) {
            sumatoria+=array[i];
        }
        media=sumatoria/array.length;
        return media;
    }

    public void mostrarArray(float[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public float maximo(float[]array){
        float maximo=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }

    public float minimo(float[]array){
        float minimo=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<minimo){
                minimo=array[i];
            }
        }
        return minimo;
    }
}
