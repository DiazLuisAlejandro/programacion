package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Bicicleta extends Vehiculo {



    public Bicicleta(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 40;
    }

    public void crearBicicleta(String marca, String modelo, String matricula, int velocidad) {
        if (velocidadMaxima()<velocidad){
            System.out.println("La bicicleta supera la velocidad maxima, no se puede crear");
        }else {
            Bicicleta bicicleta= new Bicicleta(marca,modelo, matricula,velocidad);
        }

    }
    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                '}';
    }
}
