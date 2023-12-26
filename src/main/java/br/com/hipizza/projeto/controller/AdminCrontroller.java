package br.com.hipizza.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hipizza.projeto.dto.AdminDTO;
import br.com.hipizza.projeto.service.AdminService;

@RestController
@RequestMapping(value = "/admin")
public class AdminCrontroller {

	@Autowired
	private AdminService servico;
	
	@GetMapping
	public List<AdminDTO> listarAdmin() {
		return servico.listarAdministadores();
	}
	
	@PostMapping
	public void incluirAdmin(@RequestBody AdminDTO admin) {
		servico.inserirAdmin(admin);
	}
	
	@PutMapping
	public AdminDTO alterarAdmin(@RequestBody AdminDTO admin) {
		return servico.alterarAdmin(admin);
	}
	
	@DeleteMapping("/{id}")
	public void deletarAdmin(@PathVariable Long id) {
		servico.deletarAdmin(id);
	}
}
