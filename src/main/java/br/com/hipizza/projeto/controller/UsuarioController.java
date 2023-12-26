package br.com.hipizza.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hipizza.projeto.dto.UsuarioDTO;
import br.com.hipizza.projeto.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioDTO> listarUsuario() {
		return usuarioService.listarUsuarios();
	}
	
	@PostMapping
	public void inserirUsuario(@RequestBody UsuarioDTO usuario) {
		usuarioService.inserirUsuario(usuario);
	}
	
	@PutMapping
	public UsuarioDTO alterarUsuario(@RequestBody UsuarioDTO usuario) {
		return usuarioService.alterar(usuario);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluirUsuario(@PathVariable("id") Long id) {
		usuarioService.excluirUsuario(id);
		return ResponseEntity.ok().build();
	}
}
