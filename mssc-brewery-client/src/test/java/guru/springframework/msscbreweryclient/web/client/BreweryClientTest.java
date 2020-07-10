package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.xml.bind.SchemaOutputResolver;
import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        final BeerDto beerDto = client.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    @Test
    public void saveNewBeer(){
        final BeerDto buildDto = BeerDto.builder().beerName("Lion").beerStyle("AAA").upc(10000l).build();
        final URI uri = client.saveNewBeer(buildDto);
        assertNotNull(uri);
        System.out.println("uri : " + uri.toString());
    }

    @Test
    public void updateBeer(){
        final BeerDto buildDto = BeerDto.builder().beerName("Lion").build();
        client.updateBeer(UUID.randomUUID(), buildDto);
    }

    @Test
    public void deleteBeer(){
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        final CustomerDto dto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    public void saveNewCustomer(){
        final CustomerDto dto = CustomerDto.builder().name("Lion").build();
        final URI uri = client.saveNewCustomer(dto);
        assertNotNull(uri);
        System.out.println("uri : " + uri.toString());
    }

    @Test
    public void updateCustomer(){
        final CustomerDto dto = CustomerDto.builder().name("Lion").build();
        client.updateCustomer(UUID.randomUUID(), dto);
    }

    @Test
    public void deleteCustomer(){
        client.deleteCustomer(UUID.randomUUID());
    }
}