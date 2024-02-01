package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo {

    private Motocicleta(String marca, String modelo, String matricula, int velocidad) {

        super(marca,modelo,matricula,velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 120;
    }

    public void crearMoto(String marca, String modelo, String matricula, int velocidad) {
        if (velocidadMaxima()<velocidad){
            System.out.println("El coche supera la velocidad maxima, no se puede crear");
        }else {
            Motocicleta moto= new Motocicleta(marca,modelo, matricula,velocidad);
        }

    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                '}';
    }
}
