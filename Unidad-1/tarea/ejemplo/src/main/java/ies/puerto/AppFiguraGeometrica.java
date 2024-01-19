package ies.puerto;

import ies.puerto.impl.Circulo;
import ies.puerto.impl.Cuadrado;
import ies.puerto.impl.Rectangulo;
import ies.puerto.interfaz.IFormaGeometrica;

public class AppFiguraGeometrica {

    static IFormaGeometrica circulo;

    static IFormaGeometrica rectangulo;
    static IFormaGeometrica cuadrado;

    public static void main(String[] args) {
        cuadrado=new Cuadrado(5,5);
        rectangulo=new Rectangulo(6,7);
        circulo=new Circulo(5);

        System.out.println("Area circulo: "+circulo.calcularArea());
        System.out.println("Area cuadrado: "+cuadrado.calcularArea());
        System.out.println("Area rectangulo: "+rectangulo.calcularArea());

    }
}
