package com.ccombatt.app.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ccombatt.app.modelos.Categoria;
import com.ccombatt.app.servicios.ServicioCategoria;

//http://localhost:8080/api/categorias
@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {
	
	//invocar el servicio
	@Autowired
	ServicioCategoria servicioCategoria;
	/*http://localhost:8080/api/categorias/listar
	HTPP: GET*/
	@GetMapping("/listar")
	public List<Categoria> listar() {
		return servicioCategoria.listar();
	}
	
	//http://localhost:8080/api/categorias/guardar
	//@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	@PostMapping("/guardar")
	public void guardar(@RequestBody Categoria categoria) {
		servicioCategoria.guardarOActualizar(categoria);
	}
	//http://localhost:8080/api/categorias/actualizar
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Categoria categoria) {
		servicioCategoria.guardarOActualizar(categoria);
	}
	//http://localhost:8080/api/categorias/eliminar/2
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		servicioCategoria.eliminar(id);
	}

}
