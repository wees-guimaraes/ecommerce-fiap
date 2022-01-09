package br.com.fiap.app.dto;

import br.com.fiap.app.domain.Customer;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Data
public class CustomerDto {
    private String name;
    private String email;
    private String cpf;
    private List<AddressDto> addresses;
    private Set<String> phones;
    private List<OrderedDto> ordereds;


    public CustomerDto(Customer customer) {
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.cpf = customer.getCpf();
        this.addresses = AddressDto.of(customer.getAddresses());
        this.phones = customer.getPhones();
        this.ordereds = OrderedDto.of(customer.getOrdereds());
    }

    public static List<CustomerDto> of(List<Customer> customers) {
        return customers.stream().map(CustomerDto::new).collect(Collectors.toList());
    }

}
