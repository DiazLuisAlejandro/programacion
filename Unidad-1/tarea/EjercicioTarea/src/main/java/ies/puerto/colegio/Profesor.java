package ies.puerto.colegio;

import ies.puerto.abstracta.Empleado;

public class Profesor extends Empleado {

    private String especialidad;

    public Profesor(String nombre, String dni, String fechaNacimiento,float salario, String especialidad) {
        super(nombre, dni,fechaNacimiento,salario);
        this.especialidad=especialidad;
    }
}
