package ies.puerto.abstracta;

public abstract class Persona {
    private String nombre;

    private String dni;

    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
}
