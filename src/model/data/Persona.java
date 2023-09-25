package model.data;

public class Persona {

	private String dNICliente;
	private String nombre;

	public Persona(String dNICliente, String nombre) {
		super();
		this.dNICliente = dNICliente;
		this.nombre = nombre;
	}
	public String getdNICliente() {
		return dNICliente;
	}

	public void setdNICliente(String dNICliente) {
		this.dNICliente = dNICliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}