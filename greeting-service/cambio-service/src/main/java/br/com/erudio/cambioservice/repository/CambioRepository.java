package br.com.erudio.cambioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.cambioservice.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}
