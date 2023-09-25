package model.data;

public class PedidoAlmacen extends Pedido{
	//propiedades
	private Dependiente dependiente;

	public PedidoAlmacen(Dependiente dependiente) {
		super();
		this.dependiente = dependiente;
	}

	private Dependiente getDependiente() {
		return dependiente;
	}

	private void setDependiente(Dependiente dependiente) {
		this.dependiente = dependiente;
	}

	
}
