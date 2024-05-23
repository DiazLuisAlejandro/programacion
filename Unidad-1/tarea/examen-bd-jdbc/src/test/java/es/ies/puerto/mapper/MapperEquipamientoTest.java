package es.ies.puerto.mapper;

import es.ies.puerto.dto.EquipamientoDto;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperEquipamientoTest extends MappersHelp{
    Equipamiento equipamientoMapper;
    EquipamientoDto equipamientoDtoMapper;

    @Test
    public void EquipamientoEntityToEqupamientoDto(){
        equipamientoDtoMapper=IMapperEquipamiento.INSTANCE.equipamientoToEquipamientoDto(equipamientoEntity);
        Assertions.assertEquals(equipamientoDtoMapper.getDescripcion(),equipamientoDto.getDescripcion());
        Assertions.assertEquals(equipamientoDtoMapper.getNombre(),equipamientoDto.getNombre());
        Assertions.assertEquals(equipamientoDtoMapper.getId(),equipamientoDto.getId());
    }
    @Test
    public void EquipamientoDtoToEqupamientoEntity(){
        equipamientoMapper=IMapperEquipamiento.INSTANCE.equipamientoDtoToEquipamiento(equipamientoDto);
        Assertions.assertEquals(equipamientoMapper.getDescripcion(),equipamientoEntity.getDescripcion());
        Assertions.assertEquals(equipamientoMapper.getNombre(),equipamientoEntity.getNombre());
        Assertions.assertEquals(equipamientoMapper.getId(),equipamientoEntity.getId());
    }

}
