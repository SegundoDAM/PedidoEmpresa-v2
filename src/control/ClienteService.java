package control;

import java.util.List;
import java.util.Optional;

import model.data.Cliente;
import model.data.Pedido;
import model.repositories.ClienteRepositorio;
import model.repositories.PedidoRepositorio;

public class ClienteService {

	private PedidoRepositorio pedidoRepositorio;
	private ClienteRepositorio clienteRepositorio;
	
	
	public List<Pedido> getPedidosByClienteDni(String dni){
		return pedidoRepositorio.findPedidosByCliente(clienteRepositorio.findClienteByDni(dni));
	}


	public List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		return pedidoRepositorio.findPedidosByCliente(findClienteByDni);
	}


	public List<Cliente> findClientes() {
		return clienteRepositorio.findClientes();
	}


	public Optional<Cliente> findClienteByDni(String dni) {
		return clienteRepositorio.findClienteByDni(dni);
	}
	
}
