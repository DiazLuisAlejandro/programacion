package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.Personaje;

import java.util.List;

public interface ICrudInterface {
    public List<Personaje> obtenerPersonas();

    public Personaje obtenerPersona(Personaje persona);

    public void addPersona(Personaje persona);

    public void deletePersona(Personaje persona);

    public void updatePersona(Personaje persona);

}
