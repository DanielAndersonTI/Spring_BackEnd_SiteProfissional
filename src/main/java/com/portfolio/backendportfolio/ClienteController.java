package com.portfolio.backendportfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/clientes")

public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@GetMapping

	public List<Cliente> listarClientes() {
		return clienteRepository.findAll();
	}
}
