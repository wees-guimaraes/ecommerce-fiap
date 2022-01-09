package br.com.fiap.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Double price;

	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "product_category",
		joinColumns = @JoinColumn(name = "product_id"),
		inverseJoinColumns = @JoinColumn(name = "category_id")
	)
	private List<Category> categories = new ArrayList<>();
	
	@JsonIgnore
	@OneToMany(mappedBy="id.product")
	private Set<OrderItem> items = new HashSet<>();

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@JsonIgnore
	public List<Ordered> getPedidos() {
		List<Ordered> lista = new ArrayList<>();
		for (OrderItem x : items) {
			lista.add(x.getOrdered());
		}
		return lista;
	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Product product = (Product) o;
		return id != null && Objects.equals(id, product.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
