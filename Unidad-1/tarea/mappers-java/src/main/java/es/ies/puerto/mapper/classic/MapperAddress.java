package es.ies.puerto.mapper.classic;

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
}
