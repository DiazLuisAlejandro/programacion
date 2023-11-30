package ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args) throws Exception{
        boolean verdadero=true;

            metodoConCondicion(verdadero);

    }

    public static void metodoConCondicion(boolean verdadero) throws MiclaseExceptions {
        if (verdadero){
            throw new MiclaseExceptions("MiException Lanza un mensaje");
        }
    }
}
