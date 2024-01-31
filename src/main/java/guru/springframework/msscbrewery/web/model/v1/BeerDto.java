package guru.springframework.msscbrewery.web.model.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Deprecated
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
