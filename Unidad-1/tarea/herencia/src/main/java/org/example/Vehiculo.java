package org.example;

public class Vehiculo {

    private String color;

    public Vehiculo (String color){
        this.color=color;
    }

    public Vehiculo() {

    }

    public void mover(){
        System.out.println("El vehiculo se esta moviendo");
    }
    private void apagar(){
        System.out.println("El vehiculo se ha apagado");
    }
}
