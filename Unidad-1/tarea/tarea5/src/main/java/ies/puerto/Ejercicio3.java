package ies.puerto;

import java.lang.reflect.Array;

public class Ejercicio3 {


    public String sumarAscDesc(int num1, int num2,int num3,int num4,int num5){
        int sumatoria= num1+num2+num3+num4+num5;
        String resultado="La suma de "+num1+", "+num2+", "+num3+", "+num4+" y "+ num5+" es: "+sumatoria+ " Y el orden de mayor a menor es: ";
        resultado+=ordenString(num1,num2,num3,num4,num5, resultado);

        return resultado;
    }
    public int ordenarM(int num1, int num2, int num3, int num4, int num5, String resultadoS){
        int resultado=0;
        resultado=ordenarM(ordenarM(num1, num2, resultadoS),ordenarM(num3, num4, resultadoS), resultadoS);
        resultado=ordenarM(resultado, num5, resultadoS);
        return resultado;
    }
    public int ordenarM(int num1, int num2, int num3, int num4, String resultadoS){
        int resultado=0;
        resultado=ordenarM(ordenarM(num1, num2, resultadoS),num3, resultadoS);
        resultado=ordenarM(resultado, num4, resultadoS);
        return 0;
    }
    public int ordenarM(int num1, int num2, int num3){
        return 0;
    }
    public int ordenarM(int num1, int num2, String resultadoS){
        int resultado=num1;
        ordenString(resultadoS, num1, num2);
        if (num1<num2){
            resultado=num2;
            ordenString(resultadoS, num2, num1);
        }

        return resultado;
    }

    public String ordenString(String resultado, int num1, int num2){
        resultado+=","+num1+", "+num2;
        return resultado;
    }

    public String ordenString(int num1, int num2, int num3, int num4, int num5, String resultadoS){
        ordenarM(num1,num2,num3,num4,num5, resultadoS);
        return "";
    }
}

