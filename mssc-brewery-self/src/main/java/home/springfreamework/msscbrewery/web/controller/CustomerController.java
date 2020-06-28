package home.springfreamework.msscbrewery.web.controller;

import home.springfreamework.msscbrewery.web.model.BeerDto;
import home.springfreamework.msscbrewery.web.model.CustomerDto;
import home.springfreamework.msscbrewery.web.service.CustomerService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Data
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getBeer(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(service.getCustomerById(customerId), HttpStatus.OK);
    }
}
