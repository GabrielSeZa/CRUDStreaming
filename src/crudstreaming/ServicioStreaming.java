package crudstreaming;

public class ServicioStreaming {
	private int id;
	private String nombre;
	private String tipo;
	private double precio;
	
	public ServicioStreaming(String nombre, String tipo, double precio) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
	}
	
	public int getId() { return id; }
	public String getNombre() {return nombre; }
	public String getTipo() { return tipo; }
	public double getPrecio() { return precio; }
	
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setTipo(String tipo) { this.tipo = tipo; }
	public void setPrecio(double precio) { this.precio = precio; }

}
