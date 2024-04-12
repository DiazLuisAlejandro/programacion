package es.ies.puerto.enumerado;

public enum Vehiculo {
    COCHE(1),

    CAMION(2),
    MOTO(3);

    int tipo;

    Vehiculo(int tipo){

    }

    public int getTipo(){
        return this.tipo;
    }
}
