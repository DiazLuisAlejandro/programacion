/**
 * @author Alejandro Diaz Luis
 */
public class Ejercicio6 {
    /**
     * Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000
     * @param args
     */
    public static void main(String[] args) {
        int result=0;
        int firstmodulo=0;
        int secondmodulo=0;
        int thirdmodulo=0;
        int fourthmodulo=0;
        int aux=0;

        for (int i = 1; i <= 1000; i++) {
           if(i<10){
               aux=i;
               result=aux;
           }else if (i>10 && i<100){
                aux=i;

           }
            if(i==result){
                System.out.println(result);
            }
        }
    }
}
