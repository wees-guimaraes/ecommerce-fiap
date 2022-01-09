package br.com.fiap.app.dto;

import br.com.fiap.app.domain.OrderItem;
import br.com.fiap.app.domain.Ordered;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class OrderedDto  {

	private Integer id;
	private Date instant;
	private AddressDto deliveryAddress;
	private Set<OrderItem> items;

	public OrderedDto(Ordered ordered) {
		this.id = ordered.getId();
		this.instant = ordered.getInstant();
		this.deliveryAddress = new AddressDto(ordered.getDeliveryAddress());
		this.items = ordered.getItems();
	}

	public static List<OrderedDto> of(List<Ordered> customers) {
		return customers.stream().map(OrderedDto::new).collect(Collectors.toList());
	}

}
