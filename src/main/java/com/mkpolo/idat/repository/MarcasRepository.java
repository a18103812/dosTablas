package com.mkpolo.idat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mkpolo.idat.entity.Marcas;

@Repository
public interface MarcasRepository extends CrudRepository<Marcas, Long>{
	boolean existsByMarca(String marca);
}
