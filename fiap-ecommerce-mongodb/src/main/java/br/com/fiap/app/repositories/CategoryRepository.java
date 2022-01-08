package br.com.fiap.app.repositories;

import br.com.fiap.app.domain.Category;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, ObjectId> {

}
