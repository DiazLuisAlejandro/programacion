//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int j= Factorial(16);

        System.out.println(j);

    }


    private static int Factorial(int i){
        int operar=i;
        if (i==0){
            return 1;
        }
        return operar*=Factorial(i-1);
    }
}