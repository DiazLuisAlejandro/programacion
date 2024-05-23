package es.ies.puerto.mapper;


import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.modelo.db.entidades.Alias;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAliasTest extends MappersHelp {

    AliasDto aliasDtoMapper;
    Alias aliasEntityMapper;

    @Test
    public void AliasDtoToAliasEntity(){
        aliasDtoMapper= IMapperAlias.INSTANCE.INSTANCE.aliasToAliasDto(aliasEntity);
        Assertions.assertEquals(aliasDtoMapper.getId(),aliasDto.getId());
        Assertions.assertEquals(aliasDtoMapper.getDescripcion(),aliasDto.getDescripcion());
    }

    @Test
    public void AliasEntityToAliasDto(){
        aliasEntityMapper= IMapperAlias.INSTANCE.INSTANCE.aliasDtoToAlias(aliasDto);
        Assertions.assertEquals(aliasEntityMapper.getId(),aliasEntity.getId());
        Assertions.assertEquals(aliasEntityMapper.getDescripcion(),aliasEntity.getDescripcion());
    }


}
