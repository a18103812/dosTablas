package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkpolo.idat.entity.Categoria;
import com.mkpolo.idat.repository.CategoriaRepository;

public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepo;

	@Override
	public List<Categoria> listarCategoria() {
		return (List<Categoria>) categoriaRepo.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		categoriaRepo.save(categoria);
	}

	@Override
	public Categoria buscarPorId(Long id) {
		return categoriaRepo.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		categoriaRepo.deleteById(id);
	}

	@Override
	public boolean existeCategoria(String categoria) {
		return categoriaRepo.existsByCategoria(categoria);
	}

	@Override
	public boolean existeId(Long id) {
		return categoriaRepo.existsById(id);
	}

}
