/**
 * Clase Triangulo
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Triangulo 
{
	int lado1;
	int lado2;
	int lado3;
	String tipo;//Equilatero, isosceles o escaleno
	double area;
	int perimetro;
	
	public Triangulo()
	{
		
	}
	
	public Triangulo(int lado1, int lado2, int lado3, String tipo, double area, int perimetro) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.tipo = tipo;
		this.area = area;
		this.perimetro = perimetro;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(int perimetro) {
		this.perimetro = perimetro;
	}
	
}
