package guru.springframework.msscbrewery.web.controller.v2;

import guru.springframework.msscbrewery.services.v2.CustomerServiceV2;
import guru.springframework.msscbrewery.web.model.v1.CustomerDto;
import guru.springframework.msscbrewery.web.model.v2.CustomerDtoV2;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(CustomerControllerV2.API_V2_CUSTOMER)
@AllArgsConstructor
public class CustomerControllerV2 {
    public static final String API_V2_CUSTOMER = "/api/v2/customer";
    CustomerServiceV2 customerServiceV2;
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDtoV2> getCustomerById(@PathVariable UUID id){
        return new ResponseEntity<>(customerServiceV2.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDtoV2> saveCustomer(@RequestBody CustomerDtoV2 customerDto){
        HttpHeaders headers = getHttpHeaders(customerDto);
        return new ResponseEntity<>(customerServiceV2.saveCustomer(customerDto), headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCustomer(@PathVariable UUID id, @RequestBody CustomerDtoV2 customerDto){
        customerServiceV2.updateCustomer(id, customerDto);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }

    private static HttpHeaders getHttpHeaders(CustomerDtoV2 customerDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", API_V2_CUSTOMER + "/" + customerDto.getId());
        return headers;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable UUID id){
        customerServiceV2.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
