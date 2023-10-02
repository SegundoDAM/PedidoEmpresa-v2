package model.data;

public class Vendedor extends Persona {
	public final boolean rutaEquals(Object other) {
		return ruta.equals(other);
	}

	private Ruta ruta;

	public Vendedor(String dNICliente, String nombre, Ruta ruta) {
		super(dNICliente, nombre);
		this.ruta = ruta;
	}

	public Ruta getRuta() {
		return ruta;
	}

	private void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	
}
