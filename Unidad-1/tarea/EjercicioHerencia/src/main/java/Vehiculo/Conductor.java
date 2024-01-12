package Vehiculo;

import Persona.Persona;

public class Conductor extends Persona {

    public String  permisoconducir;

    public Vehiculo vehiculo;

    public Conductor(String nombre, String dni, int edad, String permisoconducir) {
        super(nombre, dni, edad);
       this.permisoconducir=permisoconducir;
    }

    public String getPermisoconducir() {
        return permisoconducir;
    }

    public void setPermisoconducir(String permisoconducir) {
        this.permisoconducir = permisoconducir;
    }
}
