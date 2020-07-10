package home.springfreamework.msscbrewery.services.Impl;

import home.springfreamework.msscbrewery.web.model.CustomerDto;
import home.springfreamework.msscbrewery.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto
                .builder()
                .id(UUID.randomUUID())
                .name("Dimuthu")
                .build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto dto) {
        return CustomerDto
                .builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {

    }
}
