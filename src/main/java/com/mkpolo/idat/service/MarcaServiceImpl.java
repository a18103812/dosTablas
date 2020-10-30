package com.mkpolo.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkpolo.idat.entity.Marcas;
import com.mkpolo.idat.repository.MarcasRepository;

@Service
public class MarcaServiceImpl implements IMarcasService{

	@Autowired
	private MarcasRepository marcasRepo;
	
	@Override
	public List<Marcas> listarMarcas() {
		return (List<Marcas>) marcasRepo.findAll();
	}

	@Override
	public void guardar(Marcas marca) {
		marcasRepo.save(marca);
	}

	@Override
	public Marcas buscarPorId(Long id) {
		return marcasRepo.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		marcasRepo.deleteById(id);
	}

	@Override
	public boolean existeMarca(String marca) {
		return marcasRepo.existsByMarca(marca);
	}

	@Override
	public boolean existeId(Long id) {
		return marcasRepo.existsById(id);
	}

}
