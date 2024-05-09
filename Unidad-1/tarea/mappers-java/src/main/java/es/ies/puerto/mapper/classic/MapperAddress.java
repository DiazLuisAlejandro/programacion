package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;

public class MapperAddress {
    public static CustomerDTO AtoB(Address address){
        CustomerDTO customerDTO=null;
        if (address==null){
            return null;
        }
        customerDTO=new CustomerDTO();
        customerDTO.setaddress(address.getAddress());
        customerDTO.setCountry(address.getCountry());
        customerDTO.setZipCode(address.getZipCode());
        return customerDTO;
    }
    public static Address BtoA(CustomerDTO customerDTO){
        Address address=null;
        if (customerDTO==null){
            return null;
        }
        address=new Address();
        address.setAddress(customerDTO.getaddress());
        address.setCountry(customerDTO.getCountry());
        address.setZipCode(customerDTO.getZipCode());
        return address;
    }

    public static AddressDTO AddressToAddressDTO(Address address){
        AddressDTO addressDTO=null;
        if (address==null){
            return null;
        }
        addressDTO=new AddressDTO();
        addressDTO.setId(address.getId());
        addressDTO.setAddress(address.getAddress());
        addressDTO.setCountry(address.getCountry());
        addressDTO.setZipCode(address.getZipCode());
        return addressDTO;
    }
    public static Address AddressDTOtoAddress(AddressDTO addressDTO){
        Address address=null;
        if (addressDTO==null){
            return null;
        }
        address=new Address();
        address.setId(addressDTO.getId());
        address.setAddress(addressDTO.getAddress());
        address.setCountry(addressDTO.getCountry());
        address.setZipCode(addressDTO.getZipCode());
        return address;
    }

}
