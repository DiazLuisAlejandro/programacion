package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

@Root(name = "persona")
public class Persona extends UtilidadClass {

    @Element(name = "id")
     int id;

    @Element(name = "nombre")
     String nombre;

    @Element(name = "edad")
    int edad;

    @Element(name = "email")
     String email;
    



    public Persona(int id, String nombre, int edad, String email) {
        this.edad=edad;
        this.email=email;
        this.id=id;
        this.nombre=nombre;
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

    public void setId(int id) {
        this.id = id;
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
