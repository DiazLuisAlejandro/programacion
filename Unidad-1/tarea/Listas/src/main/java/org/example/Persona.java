package org.example;

import java.util.Objects;

public class Persona {
    String dni;
    String nombre;
    String apl1;
    String apl2;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public Persona(String dni, String nombre, String apl1, String apl2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apl1 = apl1;
        this.apl2 = apl2;
    }

    @Override
    public String toString() {
        return dni+": "+nombre+" "+apl1+" "+apl2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
