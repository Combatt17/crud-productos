package com.ccombatt.app.servicios;

import java.util.List;

import com.ccombatt.app.modelos.Categoria;

	//listar
	//buscarPorId
	//guardarOActualizar
	//eliminar
	
public interface IServicioCategoria {
	
	List<Categoria> listar();
	
	Categoria buscarPorId(Long id);
	
	void guardarOActualizar(Categoria categoria);
	
	//save id != null -> guardar la informacion ? actualizar 
	
	void eliminar(Long id);
}
