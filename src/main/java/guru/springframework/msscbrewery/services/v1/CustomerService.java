package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.CustomerDto;

import java.util.UUID;
@Deprecated
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
    CustomerDto saveCustomer(CustomerDto customerDto);

    CustomerDto updateCustomer(UUID id, CustomerDto customerDto);

    void deleteCustomer(UUID id);
}
