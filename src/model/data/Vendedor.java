package model.data;

public class Vendedor extends Persona {
	private Ruta ruta;

	public Vendedor(String dNICliente, String nombre, Ruta ruta) {
		super(dNICliente, nombre);
		this.ruta = ruta;
	}

	private Ruta getRuta() {
		return ruta;
	}

	private void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	
}
