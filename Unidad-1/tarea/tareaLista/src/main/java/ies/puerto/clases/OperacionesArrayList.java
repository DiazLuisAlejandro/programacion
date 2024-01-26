package ies.puerto.clases;

import java.util.ArrayList;

public class OperacionesArrayList {

    public ArrayList<String> wordList;

    public ArrayList<Integer> numberList;

    public Integer limit;

    /**

    public OperacionesArrayList(ArrayList<String> list) {
        for (String s : this.palabras = new ArrayList<>(list)) {

        }


    }
     **/

    public OperacionesArrayList(ArrayList<Integer> list){
        numberList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2) == 0){
                numberList.add(list.get(i));
            }
        }

    }

    public OperacionesArrayList(ArrayList<Integer> list, Integer limit){
        this.numberList=new ArrayList<>(list);
        this.limit=limit;
    }

    public boolean greaterThan(){
        boolean greaterThan;
        for (Integer number:numberList) {
            if (number<limit){
                return false;
            }
        }
        return true;
    }

}
