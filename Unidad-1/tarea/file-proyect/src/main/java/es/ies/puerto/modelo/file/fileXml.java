package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadClass;

import java.util.List;

public class fileXml extends UtilidadClass implements ICrudOperaciones {
    @Override
    public List<Persona> obtenerPersonas() {
        return null;
    }

    @Override
    public Persona obtenerPersona() {
        return null;
    }

    @Override
    public void addPersona(Persona persona) {

    }

    @Override
    public void deletePersona(Persona persona) {

    }

    @Override
    public void updatePersona(Persona persona) {

    }
}
