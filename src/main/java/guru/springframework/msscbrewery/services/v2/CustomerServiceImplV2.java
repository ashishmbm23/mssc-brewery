package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v1.CustomerDto;
import guru.springframework.msscbrewery.web.model.v2.CustomerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImplV2 implements CustomerServiceV2 {
    @Override
    public CustomerDtoV2 getCustomerById(UUID customerId) {
        return CustomerDtoV2.builder()
                .id(UUID.randomUUID())
                .name("Beer consumer")
                .build();
    }

    @Override
    public CustomerDtoV2 saveCustomer(CustomerDtoV2 customerDto) {
        log.info("save customer");
        return CustomerDtoV2.builder().
                id(UUID.randomUUID()).
                build();
    }

    @Override
    public CustomerDtoV2 updateCustomer(UUID id, CustomerDtoV2 customerDto) {
        log.info("update customer:" + id);
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {
        log.info("delete customer");
    }


}
