package br.com.fiap.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.app.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
