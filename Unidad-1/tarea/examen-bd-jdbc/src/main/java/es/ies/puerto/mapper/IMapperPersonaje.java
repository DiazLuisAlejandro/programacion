package es.ies.puerto.mapper;

import es.ies.puerto.dto.PersonajeDto;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperPersonaje {

    IMapperPersonaje INSTANCE= Mappers.getMapper(IMapperPersonaje.class);

    Personaje personajeDtoToPersonaje(PersonajeDto personajeDto);

    PersonajeDto personajeToPersonajeDto(Personaje personaje);


}
