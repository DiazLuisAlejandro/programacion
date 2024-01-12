package Vehiculo;

public class Coche extends Vehiculo{


    public int puertas;
    public Coche(){
        super();
    }
    public Coche(String marca, String modelo, String color, int puertas) {
        super(marca, modelo, color);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
