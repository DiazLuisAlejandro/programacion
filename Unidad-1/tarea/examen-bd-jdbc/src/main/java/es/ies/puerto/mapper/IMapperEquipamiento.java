package es.ies.puerto.mapper;

import es.ies.puerto.dto.EquipamientoDto;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface IMapperEquipamiento {

    IMapperEquipamiento INSTANCE= Mappers.getMapper(IMapperEquipamiento.class);

    Equipamiento equipamientoDtoToEquipamiento(EquipamientoDto equipamientoDto);

    EquipamientoDto equipamientoToEquipamientoDto(Equipamiento equipamiento);
}
