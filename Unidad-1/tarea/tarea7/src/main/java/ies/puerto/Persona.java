package ies.puerto;

public class Persona {

    private String nombre;
    private int edad;

    private String email;

    private int telefono;

    public Persona(){}

    public Persona(String nombre){
        this.nombre=nombre;
    }

    public Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public Persona (String nombre, int edad, String email){
        this.nombre=nombre;
        this.edad=edad;
        this.email=email;
    }

    public Persona(String nombre, int edad, String email, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\n Edad: "+edad+"\n Email: "+email+"\n Telefono: "+telefono);
    }
}
