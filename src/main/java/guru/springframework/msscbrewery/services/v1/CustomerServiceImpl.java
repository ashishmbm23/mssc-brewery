package guru.springframework.msscbrewery.services.v1;

import guru.springframework.msscbrewery.web.model.v1.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Beer consumer")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        log.info("save customer");
        return CustomerDto.builder().
                id(UUID.randomUUID()).
                build();
    }

    @Override
    public CustomerDto updateCustomer(UUID id, CustomerDto customerDto) {
        log.info("update customer:" + id);
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.info("delete customer");
    }


}
