package ies.puerto.impl;

import ies.puerto.interfaz.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {

    private float radio;

    public Circulo(float radio){
        this.radio=radio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI*radio*radio);
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }
}
