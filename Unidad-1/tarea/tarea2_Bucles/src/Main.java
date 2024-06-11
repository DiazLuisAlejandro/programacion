public class Main {


    public static void main(String[] args) {

        int result=0;
        int divide=0;

        for (double i = 1; i <=1000 ; i++) {
            result=0;
            for (int j = 0; j < i; j++) {
                if (i %j ==0){
                    result+=j;
                }
            }
            if (result == i) {
                System.out.println("This number: " + result + " is a perfect number");
            }
        }
    }
}