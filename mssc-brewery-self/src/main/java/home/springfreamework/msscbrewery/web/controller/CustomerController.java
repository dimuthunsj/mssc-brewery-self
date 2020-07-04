package home.springfreamework.msscbrewery.web.controller;

import home.springfreamework.msscbrewery.web.model.BeerDto;
import home.springfreamework.msscbrewery.web.model.CustomerDto;
import home.springfreamework.msscbrewery.web.service.CustomerService;
import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@RequestBody CustomerDto dto){
        CustomerDto customerDto = service.saveNewCustomer(dto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/cusomer/" + customerDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto dto){

        service.updateCustomer(customerId, dto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("customerId") UUID customerId){
        service.deleteById(customerId);
    }
}
