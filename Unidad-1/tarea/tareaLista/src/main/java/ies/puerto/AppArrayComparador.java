package ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

public class AppArrayComparador {

    static ArrayList<Integer> array1;
    static ArrayList<Integer> array2;

    public static void main(String[] args) {
        array1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        array2=new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20,10));
        System.out.println("Comparten elemeneto? "+"\n"+elementoComun(array1, array2));
    }

    private static boolean elementoComun(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        if (array2.size() > array1.size()){
            return elementoComun(array2,array1);
        }
        for (Integer elemento:array1) {
            if (array2.contains(elemento)){
                return true;
            }

        }
        return false;
    }
}
