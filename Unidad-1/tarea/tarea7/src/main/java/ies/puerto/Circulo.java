package ies.puerto;

public class Circulo {

    private final double pi = Math.PI;

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea(int radio){
        return radio*radio*pi;
    }


    public double getPi() {
        return pi;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
