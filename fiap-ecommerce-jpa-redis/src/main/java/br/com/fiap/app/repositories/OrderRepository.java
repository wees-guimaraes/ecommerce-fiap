package br.com.fiap.app.repositories;

import br.com.fiap.app.domain.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Ordered, Integer> {

}
