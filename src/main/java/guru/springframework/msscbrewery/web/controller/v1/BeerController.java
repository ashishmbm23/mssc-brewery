package guru.springframework.msscbrewery.web.controller.v1;

import guru.springframework.msscbrewery.services.v1.BeerService;
import guru.springframework.msscbrewery.web.model.v1.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@RequestMapping("/api/v1/beer")
@RestController
@Deprecated
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto){
        BeerDto savedBeerDto = beerService.saveNewBeer(beerDto);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location", "/api/v1/beer/" + savedBeerDto.getId());

        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer( @PathVariable UUID id, @RequestBody BeerDto beerDto){
        beerService.updateBeer(id, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping ("/{beerId}")
    public ResponseEntity<Void> deleteBeer( @PathVariable UUID id){
        beerService.deleteBeer(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
