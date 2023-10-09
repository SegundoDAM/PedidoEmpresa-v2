package model.repositories;

import java.util.List;

import model.data.PedidoComercial;
import model.data.Vendedor;

public interface PedidoComercialRepositorio {
	public List<PedidoComercial> findByVendedor(Vendedor vendedor);
}
