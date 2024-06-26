package es.ies.puerto.business;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MapperCustomer;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CustomerBusiness {
    public CustomerDTO obtainCustomerDto(CustomerDTO customerDTO){
        if (customerDTO==null){
            return null;
        }
        Customer customer= MapperCustomer.CustomerDtoToCustomerEntity(customerDTO);
        Address address= MapperAddress.BtoA(customerDTO);
        CustomerDTO response=MapperCustomer.CustomerEntityToCustomerDto(customer,address);
        return response;
    }
    public CustomerDTO obtainCustomerDto(Long id){
        if (id==null){
            return null;
        }
        CustomerDTO customerDTO=new CustomerDTO(id);
        return obtainCustomerDto(customerDTO);

    }
}
