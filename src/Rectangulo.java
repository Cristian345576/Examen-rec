
public class Rectangulo {
	private int id;
	private String nombre;
	
	public Rectangulo() {
		// olwiejhtroiqewr oiqwejrt oiqwe
	}
	public Rectangulo(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Rectangulo [id=" + id + ", nombre=" + nombre + "]";
	}
	

}
