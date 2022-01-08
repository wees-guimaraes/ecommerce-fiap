package br.com.fiap.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Ordered implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private ObjectId id;
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date instant;

	@DBRef
	private Customer customer;

	@DBRef
	private Address deliveryAddress;

	@DBRef
	private Set<OrderItem> items = new HashSet<>();

	public Ordered(Date instant, Customer customer, Address deliveryAddress) {
		this.instant = instant;
		this.customer = customer;
		this.deliveryAddress = deliveryAddress;
	}

}
