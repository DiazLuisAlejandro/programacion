package es.ies.puerto.mapper;


import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAlias {

    IMapperAlias INSTANCE= Mappers.getMapper(IMapperAlias.class);

    Alias aliasDtoToAlias(AliasDto aliasDto);
    AliasDto aliasToAliasDto(Alias alias);

}
