package br.com.fiap.app.services;

import br.com.fiap.app.repositories.CategoryRepository;
import br.com.fiap.app.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Cacheable(value= "allCategoriesCache", unless= "#result.size() == 0")
	public List<Category> findAll() {
		return repository.findAll();
	}

}
