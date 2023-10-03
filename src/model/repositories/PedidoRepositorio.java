package model.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.data.Articulo;
import model.data.Cliente;
import model.data.Pedido;
import model.data.Vendedor;

public class PedidoRepositorio {
	List<Pedido> pedidos;

	public  List<Pedido> findPedidosByCliente(Optional<Cliente> findClienteByDni) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pedido> findPedidosWithArticulo(Articulo articulo) {
		return pedidos.stream().filter((pedido)->{
			return pedido.contains(articulo);
		}).collect(Collectors.toList());
	}

	public List<Pedido> findByVendedor(Vendedor findById) {
		// TODO Auto-generated method stub
		return null;
	}
}
