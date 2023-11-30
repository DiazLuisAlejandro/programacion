package ies.puerto;

public class MiclaseExceptions extends Exception{

    private int codigoError;


    public MiclaseExceptions(){

    }

    public MiclaseExceptions(int codigoError){
        this.codigoError=codigoError;
    }

    public MiclaseExceptions(String mensaje){
        super(mensaje);
    }

    public MiclaseExceptions(int codigoError, String mensaje){
        super(mensaje);
        this.codigoError=codigoError;
    }

}
