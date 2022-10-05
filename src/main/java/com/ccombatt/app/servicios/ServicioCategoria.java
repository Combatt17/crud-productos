package com.ccombatt.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccombatt.app.modelos.Categoria;
import com.ccombatt.app.respositorios.RepositorioCategoria;

@Service
public class ServicioCategoria implements IServicioCategoria{
	
	//debemos invocar al repositorio de datos
	@Autowired
	RepositorioCategoria repositorioCategoria;
	
	@Override
	public List<Categoria> listar() {
		return (List<Categoria>) repositorioCategoria.findAll();
	}
	@Override
	public Categoria buscarPorId(Long id) {
		return repositorioCategoria.findById(id).orElse(new Categoria());
	}
	@Override
	public void guardarOActualizar(Categoria categoria) {
		repositorioCategoria.save(categoria);
	}
	@Override
	public void eliminar(Long id) {
		Categoria categoria = buscarPorId(id);
		repositorioCategoria.delete(categoria);	
	}
}
