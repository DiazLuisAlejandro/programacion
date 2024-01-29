package ies.puerto.abstracta;

public abstract class Empleado extends Trabajador {

    public Empleado(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento,salario);
    }
}
