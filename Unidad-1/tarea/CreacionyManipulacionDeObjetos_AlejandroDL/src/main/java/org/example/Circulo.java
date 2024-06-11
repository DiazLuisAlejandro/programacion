package org.example;

public class Circulo {
    private int radio;
    private final double PI=3.1415926;

    public Circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double calcularArea(){
    return radio*radio*PI;
    }
    public double calcularPerimetro(){
        return 2*PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", PI=" + PI +
                '}';
    }
}
