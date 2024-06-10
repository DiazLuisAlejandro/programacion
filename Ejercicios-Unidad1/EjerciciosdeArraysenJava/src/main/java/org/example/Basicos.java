package org.example;


public  class Basicos {
   public  String Sumar(int[] numeros){
       int sumar = 0;
       for (int i = 0; i < numeros.length ; i++) {
            sumar+=numeros[i];
       }
        return "La suma de los elementos es: " + sumar;
   }

   public String Media(float[] numeros){
       float sumar = 0f;
       for (float numero : numeros) {
           sumar += numero;
       }
       return "El promedio es: "+(sumar/(float) numeros.length);
   }

    public String MayoryMenor(int[] numeros){
       int mayor=0;
       int menor=100000;
        for (int i = 0; i < numeros.length ; i++) {
            if (mayor<numeros[i]){
                mayor=numeros[i];
            }
            if (menor>numeros[i]){
                menor=numeros[i];
            }
        }
       return "El numero mayor es: "+mayor+" y el numero menor es: "+menor;
    }

    public String pares(int[] numeros){
       String pares="Los pares son: ";
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                pares+=(numeros[i]+";");
            }
        }
        return pares;
    }

    public  String buscarValor(int[] numeros, int id){
        for (int i = 0; i <numeros.length ; i++) {
            if (numeros[i] == id) {
                return "El valor " + id + " se encuntra en el Array";

            }
        }
        return "El valor " + id + " no se encuntra en el Array";
    }



}