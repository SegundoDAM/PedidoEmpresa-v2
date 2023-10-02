package control;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Dependiente;
import model.data.Pedido;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorio;

public class Controller {
	private ClienteService service;
	private DependienteRepositorio dependienteRepositorio;
	private VendedorRepositorio vendedorRepositorio;
	//Bicontroller
	/**
	 * Todos los pedidos de un cliente (busca por dni) 
	 */
	public List<Pedido> getPedidosByClienteDni(String dni) {
		return service.getPedidosByClienteDni(dni);
	}
	/**
	 * Necesito la lista completa de clientes
	 */
	public List<Cliente> getClientes(){
		return service.findClientes();
	}
	/**
	 * necesito un cliente por id
	 */
	public Optional<Cliente> getClienteBydni(String dni){
		return service.findClienteByDni(dni);
	}
	/**
	 * Todos los articulos 
	 */
	public List<Articulo> getArticulos(){
		return articuloRepositorio.findAll();
	}
	/**
	 * Todos los articulos en un rango de precios
	 */
	public List<Articulo> getArticulosBetweenPrecios(float minimo,float maximo){
		//clausula guarda
		if(minimo<=maximo)
			return service.getArticuloByPrizeRange(minimo,maximo);
		return new LinkedList<Articulo>();
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
	/**
	 * Los pedidos donde se vende un articulo concreto
	 */
	public List<Pedido> getPedidosWithArticulo(Integer idArticulo){
		return service.getPedidosWithArticulo(idArticulo);
	}
	/**
	 * Para un cliente, la facturacion total entre dos fechas
	 */
}
