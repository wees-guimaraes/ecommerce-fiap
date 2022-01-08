package br.com.fiap.app.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@DBRef
	private Ordered ordered;
	
	@DBRef
	private Product product;

}
