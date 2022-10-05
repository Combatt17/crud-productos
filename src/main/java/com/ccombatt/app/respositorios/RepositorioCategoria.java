package com.ccombatt.app.respositorios;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ccombatt.app.modelos.Categoria;

@Repository
public interface RepositorioCategoria extends CrudRepository<Categoria, Long>{

}
