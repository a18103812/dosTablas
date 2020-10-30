package com.mkpolo.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkpolo.idat.entity.Categoria;
import com.mkpolo.idat.service.ICategoriaService;

@RestController
@RequestMapping(value="/api/categoria/")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private ICategoriaService categoriaServ;
	
	@GetMapping(value="/all")
	public List<Categoria> listar(){
		return categoriaServ.listarCategoria();
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<String> guardar(@RequestBody Categoria categoria){
		if(categoriaServ.existeCategoria(categoria.getCategoria())) {
			return new ResponseEntity("Existe",HttpStatus.OK);
		}
		categoriaServ.guardar(categoria);
		return new ResponseEntity("Creado",HttpStatus.OK);
	}
	
	@PutMapping(value="/editar")
	public ResponseEntity<String> editar(@RequestBody Categoria categoria){
		categoriaServ.guardar(categoria);
		return new ResponseEntity("Editado",HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<String> eliminar(@PathVariable Long id){
		if(categoriaServ.existeId(id)) {
			categoriaServ.eliminar(id);
			return new ResponseEntity("ELIMINADO", HttpStatus.OK);
		}else {
		return new ResponseEntity("ERROR", HttpStatus.NO_CONTENT);
		}
		}
	
}
