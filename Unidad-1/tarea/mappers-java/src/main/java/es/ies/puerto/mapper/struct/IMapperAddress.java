package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAddress {
    IMapperAddress INSTANCE = Mappers.getMapper(IMapperAddress.class);

    @Mapping(source ="provincia",target ="isla")
    AddressDTO AddressToAddressDTO(Address address);
    @Mapping(source ="isla",target ="provincia")
    Address AddressDTOToAddress(AddressDTO addressDTO);

}
