package org.example;

public class AppFigura {

    static Cuadrado cuadrado;
    static Triangulo triangulo;

    static Rectangulo rectangulo;

    public static void main(String[] args) {
        cuadrado=new Cuadrado(5f);
        System.out.println("Valor cuadrado: "+cuadrado);
       calcularArea(cuadrado);

        triangulo=new Triangulo(10f,5f);
        System.out.println("Valor triangulo: "+triangulo);
        calcularArea(triangulo);

        rectangulo=new Rectangulo(3f, 4f);
        System.out.println("Valor rectangulo: "+rectangulo);
        calcularArea(rectangulo);
        System.out.println("Valor de mi area rectangulo:"+rectangulo.calcularArea());

    }

    public static void calcularArea(Figura figura){
        System.out.println("Valor del area: "+figura.calcularArea());
    }
}
