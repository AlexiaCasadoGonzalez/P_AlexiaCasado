/**
 * Objeto Circulo
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Circulo 
{
	int radio;
	int diametro;
	int circunferencia;
	int area;
	public Circulo()
	{
		
	}
	
	public Circulo(int radio, int diametro, int circunferencia, int area) {
		super();
		this.radio = radio;
		this.diametro = diametro;
		this.circunferencia = circunferencia;
		this.area = area;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
}
