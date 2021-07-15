import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.0
 *
 */
public class Supuesto_5 
{
	Scanner inputScanner = new Scanner(System.in);
	public static List<Circulo> listaCirculos = new ArrayList<Circulo>();
	public static List<Cuadrado> listaCuadrados = new ArrayList<Cuadrado>();
	public static List<Triangulo> listaTriangulos = new ArrayList<Triangulo>();
	Random r = new Random();
	//CONTRUCTOR
	public Supuesto_5()
	{
		
	}

	/**
	 * Generación de los distintos objetos, en un principio sus propiedades iban a ser double pero trabajar con int era mas sencillo.
	 */
	public void ejercicio_5()
	{
		int num;
		System.out.println("Escribe un numero");
		num = inputScanner.nextInt();
		
		generarCirculos(num);
		generarCuadrados(num);
		generarTriangulos(num);
		
		mostrarFigurasAletoria(num);
		mostrarFiguras(num);
		
	}
	
	/**
	 * Genera n circulos con propiedades aleatorias
	 * @param num: Numero introduccido por consola
	 */
	public void generarCirculos(int num)
	{
		int radio,diametro,circunferencia,area;
	
		for(int i=0; i <num;i++)
		{
			//Rellenar el objeto nuevo con propiedades aleatorias.
			radio = r.nextInt(20) + 1;
			
			diametro = 2 * radio;
			
			circunferencia = (int) (Math.PI * diametro);
			
			area = (int) (Math.PI * Math.pow(radio, 2));

			Circulo c = new Circulo(radio,diametro,circunferencia,area);
			listaCirculos.add(c);
		}
	}
	
	/**
	 * Genera n cuadrados con propiedades aleatorias
	 * @param num: Numero introduccido por consola
	 */
	public void generarCuadrados(int num)
	{
		int diagonal, lados, areaC, perimetro;
		
		for(int i=0; i <num;i++)
		{
			
			//Rellenamos el objeto cuadrado con propiedades aleatorias.
			lados = r.nextInt(20) + 1;
			
			diagonal = (int) Math.sqrt((Math.pow(lados, 2) + Math.pow(lados, 2)));
			
			perimetro = 4 * lados;
			
			areaC = (int) Math.pow(lados, 2);
			
			Cuadrado cua = new Cuadrado(diagonal, lados, areaC, perimetro);
			listaCuadrados.add(cua);
						
		}
	}
	
	/**
	 * Genera n triangulos con propiedades aleatorias
	 * @param num: Numero introduccido por consola
	 */
	public void generarTriangulos(int num)
	{
		int lado1, lado2, lado3, area,perimetro;
		int semiP;
		String tipo;
		for(int i=0; i <num;i++)
		{	
			
			//Rellenar el objeto triangulo con propiedades aleatorias.
			lado1 =r.nextInt(20) + 1;
			
			lado2 =r.nextInt(20) + 1;
			
			lado3 =r.nextInt(20) +1;
			
			perimetro = lado1 + lado2 + lado3;
			
			semiP = perimetro/2; 
			
			area= (int) (Math.sqrt(semiP)*(semiP-lado1)*(semiP-lado2)*(semiP-lado3));//El calculo del area no esta bien :(
			
			if(lado1 == lado2 && lado2 == lado3)
				tipo = "Equilatero";
			else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				tipo = "Isosceles";
			else
				tipo = "Escaleno";
				
			
			Triangulo t = new Triangulo(lado1,lado2,lado3,tipo,area,perimetro);
			listaTriangulos.add(t);
			
				
		}
	}
	
	/**
	 * Generar una lista de figuras
	 * @param num: Numero introduccido por consola
	 */
	public void mostrarFigurasAletoria(int num)
	{
		System.out.println("--------------------------------------------------");
		System.out.println("Lista figuras");
		for(int i=0;i<num;i++)
		{
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Circulo:");
			System.out.println("|Radio: " + listaCirculos.get(i).radio+ "|Diametro: "+ listaCirculos.get(i).diametro +"|Circunferencia: "+ listaCirculos.get(i).circunferencia+ "|Area: "+ listaCirculos.get(i).area);
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Cuadrado:");
			System.out.println("|Lados: " + listaCuadrados.get(i).lados+ "|Diagonal: "+ listaCuadrados.get(i).diagonal +"|Perimetro: "+ listaCuadrados.get(i).perimetro+ "|Area: "+ listaCuadrados.get(i).area);
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Triangulo:");
			System.out.println("|Lados 1: " + listaTriangulos.get(i).lado1+ "|Lado 2: "+ listaTriangulos.get(i).lado2 + "|Lado 3: "+ listaTriangulos.get(i).lado3 + "|Perimetro: "+ listaTriangulos.get(i).perimetro+ "|Area: "+ listaTriangulos.get(i).area + "|Tipo: " + listaTriangulos.get(i).tipo);
			System.out.println("------------------------------------------------------------------------");
		}
	}
	
	/**
	 * Gnerar una lista de figuras en grupos
	 * @param num: Numero introduccido por consola
	 */
	public void mostrarFiguras(int num)
	{
		System.out.println();
		System.out.println("Figuras por grupos");
		System.out.println("--------------------------------------------------");
		System.out.println("Lista Circulos");
		for(int i=0;i<num;i++)
		{
			System.out.println("------------------------------------------------------------------------");
			System.out.println("Circulo " + i);
			System.out.println("|Radio: " + listaCirculos.get(i).radio+ "|Diametro: "+ listaCirculos.get(i).diametro +"|Circunferencia: "+ listaCirculos.get(i).circunferencia+ "|Area: "+ listaCirculos.get(i).area);
			System.out.println("------------------------------------------------------------------------");
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("Lista Cuadrados");
		for(int i=0;i<num;i++)
		{
			System.out.println("Cuadrado " + i);
			System.out.println("|Lados: " + listaCuadrados.get(i).lados+ "|Diagonal: "+ listaCuadrados.get(i).diagonal +"|Perimetro: "+ listaCuadrados.get(i).perimetro+ "|Area: "+ listaCuadrados.get(i).area);
			System.out.println("------------------------------------------------------------------------");
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("Lista Triangulos");
		for(int i=0;i<num;i++)
		{
			System.out.println("Triangulo " + i);
			System.out.println("|Lados 1: " + listaTriangulos.get(i).lado1+ "|Lado 2: "+ listaTriangulos.get(i).lado2 + "|Lado 3: "+ listaTriangulos.get(i).lado3 + "|Perimetro: "+ listaTriangulos.get(i).perimetro+ "|Area: "+ listaTriangulos.get(i).area + "|Tipo: " + listaTriangulos.get(i).tipo);
			System.out.println("------------------------------------------------------------------------");
		}
	}
}
