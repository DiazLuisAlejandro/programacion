package org.example;

public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo(){
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int calcularArea(){
        return largo*ancho;
    }
    public int calcularPerimetro(){
        return largo*2+ancho*2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
