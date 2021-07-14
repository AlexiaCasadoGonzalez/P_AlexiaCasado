import java.util.Date;

/**
 * Objeto Cliente
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
	Date fechaAlta;
	
	public Cliente(String dNI, String nombre, String apellidos, String tipo, Date fechaAlta) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.fechaAlta = fechaAlta;
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

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
}
