package control.services;

import java.util.List;
import java.util.Optional;

import model.data.Dependiente;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorio;
import model.repositories.VendedorRepositorioFOM;

public class EmpleadosService {
	private DependienteRepositorio dependienteRepositorio;
	private VendedorRepositorio vendedorRepositorio;
	
	public EmpleadosService(VendedorRepositorio vendedorRepositorio) {
		super();
		this.vendedorRepositorio = vendedorRepositorio;
	}
	/**
	 * Los dependientes, la lista de todos
	 */
	public List<Dependiente> getDpendientes(){
		return dependienteRepositorio.findAll();
	}
	/**
	 * Los vendedores con una ruta sur o central
	 */
	public List<Vendedor> getVendedoresRutaSurOCentral(){
		return vendedorRepositorio.findByRoutes(Ruta.sur,Ruta.central);
	}
	public Optional<Vendedor> getVendedorById(String idVendedor) {
		// TODO Auto-generated method stub
		return null;
	}
}
