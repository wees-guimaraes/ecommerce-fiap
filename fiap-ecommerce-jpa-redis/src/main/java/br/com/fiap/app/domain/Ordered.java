package br.com.fiap.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Ordered implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NonNull
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date instant;

	@NonNull
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	@NonNull
	@ManyToOne
	@JoinColumn(name="delivery_address_id")
	private Address deliveryAddress;

	@OneToMany(mappedBy="id.ordered")
	private Set<OrderItem> items = new HashSet<>();

	public Ordered(@NonNull Date instant, @NonNull Customer customer, @NonNull Address deliveryAddress) {
		this.instant = instant;
		this.customer = customer;
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Ordered ordered = (Ordered) o;
		return id != null && Objects.equals(id, ordered.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
