package es.ies.puerto.mapper;

import es.ies.puerto.dto.PoderDto;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperPoder {

    IMapperPoder INSTANCE= Mappers.getMapper(IMapperPoder.class);

    Poder poderDtoToPoder(PoderDto poderDto);
    PoderDto poderToPoderDto(Poder poder);
}
