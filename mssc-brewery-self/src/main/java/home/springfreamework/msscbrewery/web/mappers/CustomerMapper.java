package home.springfreamework.msscbrewery.web.mappers;

import home.springfreamework.msscbrewery.domain.Customer;
import home.springfreamework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customer);
}
