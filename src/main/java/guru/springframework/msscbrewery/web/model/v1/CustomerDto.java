package guru.springframework.msscbrewery.web.model.v1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Deprecated
public class CustomerDto {
    private UUID id;
    private String name;
}
