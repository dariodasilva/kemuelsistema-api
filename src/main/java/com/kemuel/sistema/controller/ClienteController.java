package com.kemuel.sistema.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kemuel.sistema.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Kemuel");
		cliente1.setEmail("kemuel@lucca.com");
		cliente1.setTelefone("991682605");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Esteffany");
		cliente2.setEmail("esteffany@lucca.com");
		cliente2.setTelefone("99995215");
		
		
		return Arrays.asList(cliente1, cliente2);
	}

	@GetMapping("/clientes/kemuel")
	public String ListarTracking() {
		return "Testando segundo método";
	}
}
