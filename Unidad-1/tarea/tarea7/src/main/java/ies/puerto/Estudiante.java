package ies.puerto;

public class Estudiante {

    private int edad;
    private String nombre;
    private String carrea;
    private double promedio;


    public Estudiante() {
    }

    public Estudiante(int edad, String nombre, String carrea, int[] notas) {
        this.edad = edad;
        this.nombre = nombre;
        this.carrea = carrea;
        this.promedio = calcularPromedio(notas);
    }

    private double calcularPromedio(int[] notas) {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
        }
        return (promedio / notas.length);
    }

    public String aprobar(double promedio){
        String aprobar = "Suspendido";
        if (promedio>=5.0){
            aprobar="Aprobado";
        }
        return aprobar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrea() {
        return carrea;
    }

    public void setCarrea(String carrea) {
        this.carrea = carrea;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(int [] notas) {
        this.promedio = calcularPromedio(notas);
    }
}
