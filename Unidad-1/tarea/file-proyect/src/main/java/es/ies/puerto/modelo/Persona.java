package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadClass;

import java.util.Objects;

public class Persona extends UtilidadClass {
    public int id;
    public String nombre;
    public int edad;
    public String email;
    



    public Persona(int id, String nombre, int edad, String email) {
    }
    public Persona(int id){

    }
    public Persona(){

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public String toCsv(){
        return id+DELIMITADOR+nombre+DELIMITADOR+edad+DELIMITADOR+email;
    }

    public int getId() {
        return id;
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


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
