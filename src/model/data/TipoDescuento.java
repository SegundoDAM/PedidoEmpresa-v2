package model.data;

public enum TipoDescuento {
	bajo(.1f),normal(.2f), superior(0.5f);
	
	private float cantidad;

	private TipoDescuento(float cantidad) {
		this.cantidad = cantidad;
	}

	private float getCantidad() {
		return cantidad;
	}
	
	
}
