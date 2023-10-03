package control;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import control.services.ClienteService;
import control.services.EmpleadosService;
import model.data.Articulo;
import model.data.Cliente;
import model.data.Dependiente;
import model.data.Pedido;
import model.data.Ruta;
import model.data.Vendedor;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;
import model.repositories.DependienteRepositorio;
import model.repositories.VendedorRepositorioFOM;
import model.repositories.VendedorRepositorioFicheros;

public class Controller {
	private ClienteService clienteService;
	private EmpleadosService empleadosService;
	
	

	public Controller() {
		super();
//		empleadosService=new EmpleadosService(new VendedorRepositorioFOM());
		empleadosService=new EmpleadosService(new VendedorRepositorioFicheros());
	}
	//Bicontroller
	/**
	 * Todos los pedidos de un cliente (busca por dni) 
	 */
	public List<Pedido> getPedidosByClienteDni(String dni) {
		return clienteService.getPedidosByClienteDni(dni);
	}
	/**
	 * Necesito la lista completa de clientes
	 */
	public List<Cliente> getClientes(){
		return clienteService.findClientes();
	}
	/**
	 * necesito un cliente por id
	 */
	public Optional<Cliente> getClienteBydni(String dni){
		return clienteService.findClienteByDni(dni);
	}
	/**
	 * Todos los articulos 
	 */
//	public List<Articulo> getArticulos(){
//		return articuloRepositorio.findAll();
//	}
	/**
	 * Todos los articulos en un rango de precios
	 */
	public List<Articulo> getArticulosBetweenPrecios(float minimo,float maximo){
		//clausula guarda
		if(minimo<=maximo)
			return clienteService.getArticuloByPrizeRange(minimo,maximo);
		return new LinkedList<Articulo>();
	}
	/**
	 * Los dependientes, la lista de todos
	 */
	public List<Dependiente> getDpendientes(){
		return empleadosService.getDpendientes();
	}
	/**
	 * Los vendedores con una ruta sur o central
	 */
	public List<Vendedor> getVendedoresRutaSurOCentral(){
		return empleadosService.getVendedoresRutaSurOCentral();
	}
	/**
	 * Los pedidos donde se vende un articulo concreto
	 */
	public List<Pedido> getPedidosWithArticulo(Integer idArticulo){
		return clienteService.getPedidosWithArticulo(idArticulo);
	}
	/**
	 * Para un cliente, la facturacion total entre dos fechas
	 */
	/**
	 * Lista de los pedidos vendidos por un Vendedor con id concreto
	 */
	public List<Pedido> getPedidosByVendedor(String idVendedor){
		return clienteService.getPedidosByVendedor(empleadosService.getVendedorById(idVendedor).orElseThrow());
	}
}
