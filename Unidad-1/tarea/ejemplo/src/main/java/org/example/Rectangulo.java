package org.example;

public class Rectangulo extends Figura{

    public Rectangulo(){

    }

    public Rectangulo(float base, float altura){
        super(base, altura);
    }

    @Override
    public String toString() {
        return "Base: "+getBase()+", Altura: "+getAltura();
    }

    @Override
    @Deprecated
    public float calcularArea() {
        return getBase()*getAltura();
    }
}
