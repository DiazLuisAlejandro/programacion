package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AppAddNumbers {

    static List<Integer> pairsList;
    static List<Integer> oddsList;

    public static void main(String[] args) {
        pairsList=new ArrayList<>();
        oddsList=new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i%2==0){
                pairsList.add(i);
            }else{
                oddsList.add(i);
            }
        }
        System.out.println(pairsList);
        System.out.println(oddsList);

    }
}
