package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v1.BeerDto;
import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    BeerDtoV2 updateBeer(UUID uuid, BeerDtoV2 beerDto);

    void deleteBeer(UUID uuid);
}
