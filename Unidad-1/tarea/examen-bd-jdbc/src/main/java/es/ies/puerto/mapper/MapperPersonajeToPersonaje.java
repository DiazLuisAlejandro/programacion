package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.PersonajeInt;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonajeToPersonaje {

    public PersonajeInt PersonajeEntityToPersonajeInt(Personaje personaje){
        PersonajeInt personajeInt;
        if (personaje==null){
            return null;
        }
        personajeInt=new PersonajeInt();
        personajeInt.setId(personaje.getId());
        personajeInt.setAliasInt(MapperAliasToAlias.AliasEntityToAliasInt(personaje.getAlias()));
        return personajeInt;
    }

    public Personaje PersonajeIntToPersonajeEntity(PersonajeInt personajeInt){
        Personaje personaje;
        if (personajeInt==null){
            return null;
        }
        personaje=new Personaje();
        personaje.setId(personajeInt.getId());
        personaje.setAlias(MapperAliasToAlias.AliasIntToAliasEntity(personajeInt.getAliasInt()));
        return personaje;
    }
}
