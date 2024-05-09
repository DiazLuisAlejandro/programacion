package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MappersHelp;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void AddressToAddressDTOTest(){
        addressDTOMapper= IMapperAddress.INSTANCE.AddressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMapper.getId());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMapper.getZipCode());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMapper.getCountry());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMapper.getAddress());
        Assertions.assertEquals(addressDTO.getIsla(),addressDTOMapper.getIsla());

    }
    @Test
    public void AddressDTOToAddressTest(){
        addressEntityMapper= IMapperAddress.INSTANCE.AddressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntityMapper.getId(),addressEntity.getId());
        Assertions.assertEquals(addressEntityMapper.getZipCode(),addressEntity.getZipCode());
        Assertions.assertEquals(addressEntityMapper.getCountry(),addressEntity.getCountry());
        Assertions.assertEquals(addressEntityMapper.getAddress(),addressEntity.getAddress());
        Assertions.assertEquals(addressEntityMapper.getProvincia(),addressEntity.getProvincia());

    }

    MapperAddress mapperAddress;



}