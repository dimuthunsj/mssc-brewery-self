package home.springfreamework.msscbrewery.web.service.Impl;

import home.springfreamework.msscbrewery.web.model.CustomerDto;
import home.springfreamework.msscbrewery.web.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
}
