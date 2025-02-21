package com.back.tecser_prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.back.tecser_prueba.models.VendedorModel;

@Repository
public interface VendedorRepository extends CrudRepository<VendedorModel, Long> {
	
}
