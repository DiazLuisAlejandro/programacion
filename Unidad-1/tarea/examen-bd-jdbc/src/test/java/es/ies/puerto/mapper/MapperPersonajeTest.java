package es.ies.puerto.mapper;

import es.ies.puerto.dto.PersonajeDto;
import es.ies.puerto.modelo.db.entidades.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPersonajeTest extends MappersHelp{

    Personaje personajeEntityMapper;
    PersonajeDto personajeDtoMapper;

    @Test
    public void PersonajeEntityToPersonajeDtoTest(){
        personajeDtoMapper=IMapperPersonaje.INSTANCE.personajeToPersonajeDto(personajeEntity);
        Assertions.assertEquals(personajeDtoMapper.getAlias(),personajeDto.getAlias());
        Assertions.assertEquals(personajeDtoMapper.getGenero(),personajeDto.getGenero());
        Assertions.assertEquals(personajeDtoMapper.getId(),personajeDto.getId());
        Assertions.assertEquals(personajeDtoMapper.getPoderes(),personajeDto.getPoderes());
        Assertions.assertEquals(personajeDtoMapper.getEquipamientos(),personajeDto.getEquipamientos());
        Assertions.assertEquals(personajeDtoMapper.getNombre(),personajeDto.getNombre());
    }

    @Test
    public void PersonajeDtoToPersonajeEntityTest(){
        personajeEntityMapper=IMapperPersonaje.INSTANCE.personajeDtoToPersonaje(personajeDto);
        Assertions.assertEquals(personajeEntityMapper.getAlias(),personajeEntity.getAlias());
        Assertions.assertEquals(personajeEntityMapper.getGenero(),personajeEntity.getGenero());
        Assertions.assertEquals(personajeEntityMapper.getId(),personajeEntity.getId());
        Assertions.assertEquals(personajeEntityMapper.getPoderes(),personajeEntity.getPoderes());
        Assertions.assertEquals(personajeEntityMapper.getEquipamientos(),personajeEntity.getEquipamientos());
        Assertions.assertEquals(personajeEntityMapper.getNombre(),personajeEntity.getNombre());
    }


}
