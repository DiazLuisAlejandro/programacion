package ies.puerto;

import ies.puerto.clases.OperacionesArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AppOperacionesArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,33,44,112,2424,3635423,525254,1313,5213));
        OperacionesArrayList numPares =new OperacionesArrayList(list);

        System.out.println("Los numeros pares serian: "+numPares.numberList);
    }
}
