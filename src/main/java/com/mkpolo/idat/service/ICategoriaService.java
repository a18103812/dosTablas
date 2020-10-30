package com.mkpolo.idat.service;

import java.util.List;

import com.mkpolo.idat.entity.Categoria;

public interface ICategoriaService {

	public List<Categoria> listarCategoria();
	
	public void guardar (Categoria categoria);
	
	public Categoria buscarPorId(Long id);
	
	public void eliminar(Long id);
	
	public boolean existeCategoria(String categoria);
	
	public boolean existeId(Long id);
	
}
