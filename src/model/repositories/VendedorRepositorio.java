package model.repositories;

import java.util.List;
import java.util.Optional;

import model.data.Ruta;
import model.data.Vendedor;

public interface VendedorRepositorio {
	public List<Vendedor> findByRoutes(Ruta... rutas) ;
	public Optional<Vendedor> findById(String idVendedor);
}
