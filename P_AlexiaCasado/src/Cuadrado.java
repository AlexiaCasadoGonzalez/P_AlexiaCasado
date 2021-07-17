/**
 * Clase Cuadrado
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Cuadrado 
{
	int diagonal;
	int lados;
	int area;
	int perimetro;
	public Cuadrado()
	{
		
	}
	
	public Cuadrado(int diagonal, int lados, int area, int perimetro) {
		super();
		this.diagonal = diagonal;
		this.lados = lados;
		this.area = area;
		this.perimetro = perimetro;
	}
	public double getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}
	public double getLados() {
		return lados;
	}
	public void setLados(int lados) {
		this.lados = lados;
	}
	public double getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
}
