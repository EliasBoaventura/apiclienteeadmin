package br.com.hipizza.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hipizza.projeto.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

}
