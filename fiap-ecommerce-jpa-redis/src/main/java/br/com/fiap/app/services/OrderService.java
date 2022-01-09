package br.com.fiap.app.services;

import br.com.fiap.app.domain.Ordered;
import br.com.fiap.app.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	@Cacheable(value= "allOrderedsCache", unless= "#result.size() == 0")
	public List<Ordered> findAll() {
		return repository.findAll();
	}
}
