package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MappersHelp {

    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void AddressToAddressDTOTest(){
        addressDTOMapper=MapperAddress.AddressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(),addressDTOMapper.getId());
        Assertions.assertEquals(addressDTO.getZipCode(),addressDTOMapper.getZipCode());
        Assertions.assertEquals(addressDTO.getCountry(),addressDTOMapper.getCountry());
        Assertions.assertEquals(addressDTO.getAddress(),addressDTOMapper.getAddress());

    }

    MapperAddress mapperAddress;



}
