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
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Document
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    private String name;
    private String email;
    private String cpf;

    @DBRef
    private List<Address> addresses = new ArrayList<>();

    private Set<String> telefones = new HashSet<>();

    @DBRef
    private List<Ordered> ordereds = new ArrayList<>();

    public Customer(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }
}
