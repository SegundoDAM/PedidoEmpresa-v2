package control;

import java.util.List;

import model.data.Dependiente;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorioFOM;

public class EmpleadosService {
	private DependienteRepositorio dependienteRepositorio;
	private VendedorRepositorioFOM vendedorRepositorio;
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
}
