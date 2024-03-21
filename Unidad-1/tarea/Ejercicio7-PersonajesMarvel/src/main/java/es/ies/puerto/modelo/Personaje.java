package es.ies.puerto.modelo;

import java.util.Set;

public class Personaje {
    //nombre,alias,genero,poderes

    public String nombre;

    public String alias;

    public String genero;

    public Set<String> poderes;

    public Personaje(){

    }

    public Personaje(String nombre, String alias, String genero, Set<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }
}
