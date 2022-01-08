package br.com.fiap.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@Document
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	private String street;
	private String number;
	private String neighborhood;
	private String postalCode;
	private String city;
	private String state;
	
	@DBRef
	private Customer customer;

	public Address(String street, String number, String neighborhood, String postalCode, String city, String state, Customer customer) {
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.postalCode = postalCode;
		this.city = city;
		this.state = state;
		this.customer = customer;
	}
}
