package br.com.fiap.app.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Document
public class OrderItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private OrderItemPK id = new OrderItemPK();


	public OrderItem(Ordered ordered, Product product) {
		id.setOrdered(ordered);
		id.setProduct(product);
	}

	@JsonIgnore
	public Ordered getOrdered() {
		return id.getOrdered();
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public OrderItemPK getId() {
		return id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}

}
