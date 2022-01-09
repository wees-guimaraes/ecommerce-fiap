package br.com.fiap.app.dto;


import br.com.fiap.app.domain.Address;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class AddressDto implements Serializable {
    private static final long serialVersionUID = -363738771866640787L;

    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String postalCode;
    private String city;
    private String state;

    public AddressDto(Address address) {
        this.street = address.getStreet();
        this.number = address.getNumber();
        this.complement = address.getComplement();
        this.neighborhood = address.getNeighborhood();
        this.city = address.getCity();
        this.state = address.getState();
        this.postalCode = address.getPostalCode();
    }

    public static List<AddressDto> of(List<Address> customers) {
        return customers.stream().map(AddressDto::new).collect(Collectors.toList());
    }
}
