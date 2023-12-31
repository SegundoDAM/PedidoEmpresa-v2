package control.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.Vendedor;
import model.repositories.ArticuloRepositorio;
import model.repositories.ClienteRepositorio;
import model.repositories.PedidoComercialRepositorio;
import model.repositories.PedidoRepositorio;
import model.repositories.VendedorRepositorioFOM;

public class VentaService {

	private PedidoRepositorio pedidoRepositorio;
	private ArticuloRepositorio articuloRepositorio;
	private ClienteRepositorio clienteRepositorio;
	private PedidoComercialRepositorio pedidoComercialRepositorio;
	
	public VentaService() {
		super();
		pedidoRepositorio=new PedidoRepositorio();
	}


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


	public List<Pedido> getPedidosWithArticulo(Integer idArticulo) {
		return pedidoRepositorio.findPedidosWithArticulo(articuloRepositorio.findById(idArticulo).orElseThrow());
	}


	public List<Articulo> getArticuloByPrizeRange(float minimo, float maximo) {
		return articuloRepositorio.findByRange(minimo, maximo);
	}


	public List<Pedido> getPedidosByVendedor(Vendedor vendedor) {
		return pedidoComercialRepositorio.findByVendedor(vendedor)
				.stream()
				.map((pedido)->{return (Pedido)pedido;})
				.collect(Collectors.toList());
	}
	
}
