package home.springfreamework.msscbrewery.web.service;

import home.springfreamework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
