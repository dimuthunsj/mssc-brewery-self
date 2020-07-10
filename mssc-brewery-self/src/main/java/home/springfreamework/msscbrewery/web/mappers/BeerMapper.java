package home.springfreamework.msscbrewery.web.mappers;

import home.springfreamework.msscbrewery.domain.Beer;
import home.springfreamework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
