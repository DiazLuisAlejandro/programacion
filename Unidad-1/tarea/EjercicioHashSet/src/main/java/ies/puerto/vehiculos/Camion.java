package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Camion extends Vehiculo {


    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 160;
    }
    public void crearCamion(String marca, String modelo, String matricula, int velocidad) {
        if (velocidadMaxima()<velocidad){
            System.out.println("El camion supera la velocidad maxima, no se puede crear");
        }else {
            Camion camion= new Camion(marca,modelo, matricula,velocidad);
        }

    }
    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                '}';
    }
}
