package es.ies.puerto;

public class Ejercicio1 {

    public static void main(String[] args) {
        cuentaRegresiva(10);
    }

    private static void cuentaRegresiva(int i) {
        System.out.println(i);
        if (i>0) {
            cuentaRegresiva(i - 1);
        }
    }

}