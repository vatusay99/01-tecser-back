package com.back.tecser_prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.back.tecser_prueba.models.VentasModel;

@Repository
public interface VentasRepository extends CrudRepository<VentasModel, Long> {

	
}
