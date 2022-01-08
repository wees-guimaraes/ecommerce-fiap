package br.com.fiap.app.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private ObjectId id;
	private String name;
	
	@DBRef
	private List<Product> products = new ArrayList<>();

	public Category(String name) {
		this.name = name;
	}

}
