package br.com.fiap.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Document
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id;
	private String name;
	private Double price;

	@DBRef
	private List<Category> categories = new ArrayList<>();
	
	@DBRef
	private Set<OrderItem> items = new HashSet<>();

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
}
