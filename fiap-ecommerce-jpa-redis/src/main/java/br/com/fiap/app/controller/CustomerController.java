package br.com.fiap.app.controller;

import br.com.fiap.app.dto.CustomerDto;
import br.com.fiap.app.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping
	public ResponseEntity<List<CustomerDto>> findAll() {
		var obj = service.findAll();
		return ResponseEntity.ok().body(CustomerDto.of(obj));
	}
}
