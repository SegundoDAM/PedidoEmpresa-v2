package control;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;

public class Controller {
	private ClienteService service;
	private ArticuloRepositorio articuloRepositorio;
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
			return articuloRepositorio.findByRange(minimo,maximo);
		return new LinkedList<Articulo>();
	}
	/**
	 * Los dependientes, la lista de todos
	 */
	/**
	 * Los vendedores con una ruta sur o central
	 */
	/**
	 * Los pedidos donde se vende un articulo concreto
	 */
	/**
	 * Para un cliente, la facturacion total entre dos fechas
	 */
}
