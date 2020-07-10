package home.springfreamework.msscbrewery.web.controller;

import home.springfreamework.msscbrewery.web.model.BeerDto;
import home.springfreamework.msscbrewery.services.BeerService;
import lombok.Data;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * Created by User on 6/18/2020.
 */

@Validated
@Data
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService service;

    public BeerController(BeerService service) {
        this.service = service;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@NotNull  @PathVariable("beerId") UUID beetId){
        return new ResponseEntity<>(service.getBeerById(beetId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@Valid @RequestBody BeerDto dto){
        BeerDto savedBeerDto = service.saveNewBeer(dto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeerDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){

        service.updateBeer(beerId, beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        service.deleteById(beerId);
    }
}
