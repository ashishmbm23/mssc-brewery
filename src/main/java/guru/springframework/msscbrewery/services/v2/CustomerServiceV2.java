package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v1.CustomerDto;
import guru.springframework.msscbrewery.web.model.v2.CustomerDtoV2;

import java.util.UUID;

public interface CustomerServiceV2 {
    CustomerDtoV2 getCustomerById(UUID customerId);
    CustomerDtoV2 saveCustomer(CustomerDtoV2 customerDto);

    CustomerDtoV2 updateCustomer(UUID id, CustomerDtoV2 customerDto);

    void deleteCustomer(UUID id);
}
