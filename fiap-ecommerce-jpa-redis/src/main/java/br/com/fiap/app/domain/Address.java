package br.com.fiap.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String postalCode;
	private String city;
	private String state;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Address(String street, String number,String complement, String neighborhood,  String city, String state,String postalCode, Customer customer) {
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.customer = customer;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Address address = (Address) o;
		return id != null && Objects.equals(id, address.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
