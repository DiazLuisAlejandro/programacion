package ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;

public class AppEraseRepeated {

    static ArrayList<String> myList;

    public static void main(String[] args) {
        myList=new ArrayList<>(Arrays.asList("Beacon","Minecart","Torch","Apple","Iron Sword","Minecart","Apple","Dirt","Grass","Cobblestone","Torch"));
        ArrayList<String> newList=new ArrayList<>();

        for (String word:myList) {
            if (!newList.contains(word)){
                newList.add(word);
            }
        }
        System.out.println(myList);
        System.out.println(newList);
    }
}
