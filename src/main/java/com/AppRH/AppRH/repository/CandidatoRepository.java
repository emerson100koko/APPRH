package com.AppRH.AppRH.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppRH.AppRH.models.Canditado;
import com.AppRH.AppRH.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Canditado, String> {

	Iterable<Canditado> findByVaga(Vaga vaga);
	
	Canditado findByRg(String rg);
	
	Canditado findById(long id);
	
	List<Canditado> findByNomeCandidato(String nomeCandidato);}
