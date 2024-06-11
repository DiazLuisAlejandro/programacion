package org.example;

public class Estudiante {

    private String nombe;
    private int edad;
    private String carrera;
    private int promedio;

    public Estudiante() {
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public boolean estaAprobado(){
        if (promedio>=5){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombe='" + nombe + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
