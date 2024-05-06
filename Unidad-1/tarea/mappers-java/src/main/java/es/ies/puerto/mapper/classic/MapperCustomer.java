package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class MapperCustomer {

    public static Customer CustomerDtoToCustomerEntity(CustomerDTO customerDTO){
        Customer customer=null;
        if (customerDTO==null){
            return null;
        }
        customer=new Customer();
        customer.setId(customerDTO.getId());
        customer.setFirstname(customerDTO.getFullName());
        customer.setLastname(customerDTO.getFullName());
        return customer;
    }
    public static CustomerDTO CustomerEntityToCustomerDto(Customer customer, Address address){
        CustomerDTO customerDTO=null;
        if (customer==null){
            return null;
        }
        customerDTO=new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setFullName(customer.getFirstname()+" "+customer.getLastname());
        if (address!=null){
            customerDTO.setZipCode(address.getZipCode());
            customerDTO.setCountry(address.getCountry());
            customerDTO.setaddress(address.getAddress());
        }
        return customerDTO;
    }
}
