package control;

import java.util.List;
import java.util.Optional;

import model.data.Cliente;
import model.repositories.ClienteRepositorio;

public class Controller {
	//TODO
	private ClienteRepositorio clienteRepositorio;
	/**
	 * Necesito la lista completa de clientes
	 */
	public List<Cliente> getClientes(){
		//TODO
		return clienteRepositorio.findClientes();
	}
	/**
	 * necesito un cliente por id
	 */
	public Optional<Cliente> getClienteBydni(String dni){
		return clienteRepositorio.findClienteByDni(dni);
	}
	/**
	 * Todos los articulos 
	 */
	/**
	 * Todos los articulos en un rango de precios
	 */
}
