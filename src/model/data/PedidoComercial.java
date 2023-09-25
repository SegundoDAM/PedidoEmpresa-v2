package model.data;
public class PedidoComercial extends Pedido {
	// propiedades
	private Vendedor vendedor;

	public PedidoComercial(Vendedor vendedor) {
		super();
		this.vendedor = vendedor;
	}

	private Vendedor getVendedor() {
		return vendedor;
	}

	private void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
}
