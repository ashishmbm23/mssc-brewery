package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID uuid, BeerDto beerDto);

    void deleteBeer(UUID uuid);
}
