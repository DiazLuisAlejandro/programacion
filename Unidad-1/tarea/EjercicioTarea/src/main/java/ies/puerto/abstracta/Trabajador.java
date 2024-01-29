package ies.puerto.abstracta;

public class Trabajador extends Persona {
    private float salario;

    public Trabajador(String nombre, String dni, String fechaNacimiento, float salario) {
        super(nombre, dni, fechaNacimiento);
        this.salario=salario;
    }

}
