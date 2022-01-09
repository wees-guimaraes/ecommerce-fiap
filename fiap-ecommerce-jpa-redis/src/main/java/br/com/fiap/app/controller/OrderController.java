package br.com.fiap.app.controller;

import br.com.fiap.app.domain.Ordered;
import br.com.fiap.app.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Ordered>> findAll() {
		var obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
}
