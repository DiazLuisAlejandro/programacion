package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.PersonaList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadClass;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends UtilidadClass implements ICrudOperaciones {

    public void FileXml(){
        personas=new ArrayList<>();
    }

    List<Persona> personas;
    String path="src/main/ressources/data.xml";
    @Override
    public List<Persona> obtenerPersonas() {
        Persister serializer= new Persister();
        try{
            File file=new File(path);
            PersonaList personaList=serializer.read(PersonaList.class, file);
            personas=personaList.getPersonas();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return personas;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        if(!personas.contains(persona)){
            return null;
        }
        int posicion= personas.indexOf(persona);
        return personas.get(posicion);
    }

    @Override
    public void addPersona(Persona persona) {
        if(personas.contains(persona)){
            return;
        }
        personas.add(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        if(!personas.contains(persona)){
            return;
        }
        personas.remove(persona);

    }

    @Override
    public void updatePersona(Persona persona) {
        if(!personas.contains(persona)){
            return;
        }
        int posiscion=personas.indexOf(persona);
        personas.set(posiscion,persona);
    }

    private void actualizarFichero(List<Persona> personas){

    }
}
