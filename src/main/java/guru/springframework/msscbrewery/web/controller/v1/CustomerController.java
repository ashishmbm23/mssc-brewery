package guru.springframework.msscbrewery.web.controller.v1;

import guru.springframework.msscbrewery.services.v1.CustomerService;
import guru.springframework.msscbrewery.web.model.v1.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {
    CustomerService customerService;
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable UUID id){
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto){
        HttpHeaders headers = getHttpHeaders(customerDto);
        return new ResponseEntity<>(customerService.saveCustomer(customerDto), headers, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCustomer(@PathVariable UUID id, @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(id, customerDto);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }

    private static HttpHeaders getHttpHeaders(CustomerDto customerDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/customer/" + customerDto.getId());
        return headers;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable UUID id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
