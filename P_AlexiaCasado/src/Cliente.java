
/**
 * Clase cliente
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Cliente 
{
	String DNI;
	String nombre;
	String apellidos;
	String tipo;
	String fechaAlta;
	String cuotaMaxima;
	
	public Cliente()
	{
		
	}
	
	public Cliente(String DNI, String nombre, String apellidos, String tipo, String fechaAlta, String cuotaMaxima) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.fechaAlta = fechaAlta;
		this.cuotaMaxima = cuotaMaxima;
	}

	public String getCuotaMaxima() {
		return cuotaMaxima;
	}

	public void setCuotaMaxima(String cuotaMaxima) {
		this.cuotaMaxima = cuotaMaxima;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
}
