package br.com.hipizza.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hipizza.projeto.dto.AdminDTO;
import br.com.hipizza.projeto.entity.AdminEntity;
import br.com.hipizza.projeto.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public List<AdminDTO> listarAdministadores(){
		List<AdminEntity> administradores = adminRepository.findAll();
		
		return administradores.stream().map(AdminDTO::new).toList();
	}
	
	public void inserirAdmin(AdminDTO admin) {
		AdminEntity adminEntity = new AdminEntity(admin);
		adminRepository.save(adminEntity);
	}
	
	public AdminDTO alterarAdmin(AdminDTO admin) {
		AdminEntity adminEntity = new AdminEntity(admin);
		adminRepository.save(adminEntity);
		
		return new AdminDTO(adminEntity);
	}
	
	public void deletarAdmin(Long id){
		adminRepository.deleteById(id);
	}
	
	public AdminDTO buscarAdmin(Long id) {
		AdminEntity adminEntity = adminRepository.findById(id).get();
		return new AdminDTO(adminEntity);
		
	}
	
}
