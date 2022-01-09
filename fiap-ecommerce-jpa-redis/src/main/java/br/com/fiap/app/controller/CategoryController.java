package br.com.fiap.app.controller;

import br.com.fiap.app.domain.Category;
import br.com.fiap.app.dto.CategoryDto;
import br.com.fiap.app.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> findAll() {
        List<Category> list = service.findAll();
        List<CategoryDto> listDTO = list.stream().map(CategoryDto::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}