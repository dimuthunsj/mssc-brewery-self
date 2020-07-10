package home.springfreamework.msscbrewery.services;

import home.springfreamework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by User on 6/18/2020.
 */
public interface BeerService {

    BeerDto getBeerById(UUID beetId);

    BeerDto saveNewBeer(BeerDto dto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
