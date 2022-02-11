
public class Libro implements Comparable<Libro>{
	
	private String isnb;
	private String titulo;
	private double precio;
	private int cantidad;
	
	public Libro(String isnb, String titulo, double precio, int cantidad) {
		this.isnb = isnb;
		this.titulo = titulo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	public String getIsbn() {
		return isnb;
	}
	public void setIsbn(String isnb) {
		this.isnb = isnb;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	@Override
	public boolean equals(Object obj) {
		Libro l = (Libro)obj;
		return this.isnb.equals(l.isnb);
	}
	
	@Override
	public String toString() {
		return this.isnb + "\t" + this.titulo + "\t" + this.cantidad + "\t" + this.precio+"$";
	}

	@Override
	public int compareTo(Libro l) {
		return this.cantidad - l.getCantidad();
	}
}