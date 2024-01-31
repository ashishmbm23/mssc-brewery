package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Service
@Deprecated
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID uuid, BeerDto beerDto) {
        return null;
    }

    @Override
    public void deleteBeer(UUID uuid) {

    }
}
