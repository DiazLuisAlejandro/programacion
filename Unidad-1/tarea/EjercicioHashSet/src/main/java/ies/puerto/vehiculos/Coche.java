package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo {

    private Coche(String marca, String modelo, String matricula, int velocidad) {

        super(marca,modelo,matricula,velocidad);
    }
    @Override
    public int velocidadMaxima() {
        return 180;
    }

    public void crearCoche(String marca, String modelo, String matricula, int velocidad) {
        if (velocidadMaxima()<velocidad){
            System.out.println("La motocicleta supera la velocidad maxima, no se puede crear");
        }else {
            Coche coche= new Coche(marca,modelo, matricula,velocidad);
        }

    }
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad() +
                '}';
    }
}
