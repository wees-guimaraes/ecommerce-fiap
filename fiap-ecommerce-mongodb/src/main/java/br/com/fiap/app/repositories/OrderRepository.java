package br.com.fiap.app.repositories;

import br.com.fiap.app.domain.Ordered;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Ordered, String> {

}
