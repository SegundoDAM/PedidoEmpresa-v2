package model.data;

public class Cliente extends Persona {
	
	//Todos los clientes con descuento tienen el mismo descuento
	private static float descuento=0.2f;
	private boolean descuentoAplicado;
	
	public Cliente(String dNICliente, String nombre, boolean descuentoAplicado) {
		super(dNICliente, nombre);
		this.descuentoAplicado = descuentoAplicado;
	}

	private static float getDescuento() {
		return descuento;
	}

	private boolean isDescuentoAplicado() {
		return descuentoAplicado;
	}

	private void setDescuentoAplicado(boolean descuentoAplicado) {
		this.descuentoAplicado = descuentoAplicado;
	}

	
}
