package com.ccombatt.app.controladores;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/api/categorias
@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {
	/*http://localhost:8080/api/categorias/listar
	HTPP: GET*/
	@GetMapping("/listar")
	public String listar() {
		return "Listado de categorias";
	}
	
	//http://localhost:8080/api/categorias/guardar
	//@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	@PostMapping("/guardar")
	public String guardar() {
		return "Se ha guardado una categoria";
	}
	//http://localhost:8080/api/categorias/actualizar
	@PutMapping("/actualizar")
	public String actualizar() {
		return "Se ha actualizado la categoria";
	}
	//http://localhost:8080/api/categorias/eliminar/2
	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable("id") Long id) {
		return "Se ha eliminado la categoria "+id;
	}

}
