package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import objectMother.ArticulosOM;

public class ArticuloRepositorio {

	List<Articulo> articulos;
	
	
	public ArticuloRepositorio() {
		super();
		articulos=new ArticulosOM().getArticulos();
	}

	public List<Articulo> findAll(){
		return articulos;
	}
	
	public Optional<Articulo> findById(int id) {
		for (Articulo articulo : articulos) {
			if(articulo.getId()==id)
				return Optional.of(articulo);
		}
		return Optional.ofNullable(null);
	}
}
