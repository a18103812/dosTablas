package com.mkpolo.idat.service;

import java.util.List;
import com.mkpolo.idat.entity.Marcas;

public interface IMarcasService {

	public List<Marcas> listarMarcas();
	
	public void guardar (Marcas marca);
	
	public Marcas buscarPorId(Long id);
	
	public void eliminar(Long id);
	
	public boolean existeMarca(String marca);
	
	public boolean existeId(Long id);
}
