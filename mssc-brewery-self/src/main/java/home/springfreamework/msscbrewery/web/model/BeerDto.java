package home.springfreamework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

/**
 * Created by User on 6/17/2020.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
