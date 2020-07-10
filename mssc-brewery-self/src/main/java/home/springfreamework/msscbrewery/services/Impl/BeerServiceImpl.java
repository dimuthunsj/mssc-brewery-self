package home.springfreamework.msscbrewery.services.Impl;

import home.springfreamework.msscbrewery.web.model.BeerDto;
import home.springfreamework.msscbrewery.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by User on 6/18/2020.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    public BeerDto getBeerById(UUID beetId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto dto) {

        return BeerDto
                .builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
