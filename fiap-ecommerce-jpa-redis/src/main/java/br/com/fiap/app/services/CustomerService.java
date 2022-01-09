package br.com.fiap.app.services;

import br.com.fiap.app.domain.Customer;
import br.com.fiap.app.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;

	@Cacheable(value= "allCustomersCache", unless= "#result.size() == 0")
	public List<Customer> findAll() {
		return repository.findAll();
	}
}
