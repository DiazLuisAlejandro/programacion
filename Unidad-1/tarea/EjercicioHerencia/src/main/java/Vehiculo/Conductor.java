package Vehiculo;

import Persona.Persona;

public class Conductor extends Persona {

    public String  permisoconducir;
    public Conductor(String nombre, String dni, int edad, String permisoconducir) {
        super(nombre, dni, edad);
       this.permisoconducir=permisoconducir;
    }
}
