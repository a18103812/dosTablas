package com.mkpolo.idat.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mkpolo.idat.entity.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long>{

	boolean existsByCategoria(String categoria);
}
