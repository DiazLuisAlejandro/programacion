package Vehiculo;

public class Motocicleta extends Vehiculo{

    public boolean maleta;
    public Motocicleta(){
        super();
    }

    public Motocicleta(String marca, String modelo, String color, boolean maleta) {
        super(marca, modelo, color);
        this.maleta= maleta;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
