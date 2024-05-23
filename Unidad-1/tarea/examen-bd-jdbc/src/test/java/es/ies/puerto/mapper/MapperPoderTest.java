package es.ies.puerto.mapper;

import es.ies.puerto.dto.PoderDto;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPoderTest extends MappersHelp{

    Poder poderMapper;
    PoderDto poderDtoMapper;

    @Test
    public void poderEntityToPoderDto(){
        poderDtoMapper=IMapperPoder.INSTANCE.poderToPoderDto(poderEntity);
        Assertions.assertEquals(poderDtoMapper.getId(),poderDto.getId());
        Assertions.assertEquals(poderDtoMapper.getNombre(),poderDto.getNombre());
    }
    @Test
    public void poderDtoToPoderEntity(){
        poderMapper=IMapperPoder.INSTANCE.poderDtoToPoder(poderDto);
        Assertions.assertEquals(poderMapper.getId(),poderEntity.getId());
        Assertions.assertEquals(poderMapper.getNombre(),poderEntity.getNombre());
    }
}
