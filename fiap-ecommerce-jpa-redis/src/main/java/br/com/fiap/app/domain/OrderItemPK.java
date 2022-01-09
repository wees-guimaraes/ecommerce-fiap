package br.com.fiap.app.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="ordered_id")
	private Ordered ordered;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OrderItemPK that = (OrderItemPK) o;
		return Objects.equals(ordered, that.ordered) && Objects.equals(product, that.product);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ordered, product);
	}
}
