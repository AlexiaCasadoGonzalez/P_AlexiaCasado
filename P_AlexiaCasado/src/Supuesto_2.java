import java.util.Scanner;

/**
 * ESTA CLASE SE ENCARGARA DE RELIZAR DIFERENTES OPERACIONES CON DIFERENTES NÚMEROS
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Supuesto_2 
{
	double r = 1;
	//CONSTRUCTOR
	public Supuesto_2()
	{
		
	}
	
	/**
	 * ESTE METODO SE ENCARGARA DE LLAMAR A LOS DIFERENTES METODOS Y CONSEGUIR LOS NÚMEROS DE MANERA CORRECTA POR CONSOLA.
	 */
	public void ejercicio_2()
	{
		boolean i = false,f1,f2,f3;
		Scanner entradaEscaner = new Scanner (System.in);
		String entrada_1 = "";
		String entrada_2 = "";
		String entrada_3 = "";
		
		//Los numero decimales se escribiran de la siguiente forma: 2.3 no 2,3
		while(i != true)
		{
			System.out.println ("Por favor introduzca un número decimal por teclado:");
			entrada_1 = entradaEscaner.nextLine ();
			f1 = validarDouble(entrada_1);
			
			System.out.println ("Por favor introduzca un número decimal por teclado:");
			entrada_2 = entradaEscaner.nextLine ();
			f2 = validarDouble(entrada_2);
			
			System.out.println ("Por favor introduzca el numero de decimales a redondear por teclado:");
			entrada_3 = entradaEscaner.nextLine ();
			f3 = validarNumero(entrada_3);
			
			//Mensajes de error si los numeros son incorrectos
			if(f1 == true && f2 == true && f3 == true)
				i= true;
			else if(f1 == false && f2 == false && f3 == false)
				System.out.println("Ha introducido los números de forma erronea");
			else if(f1 == false)
				System.out.println("No ha introducido bien el número " + entrada_1);
			else if(f2 == false)
				System.out.println("No ha introducido bien el número " + entrada_2);
			else if(f3 == false)
				System.out.println("No ha introducido bien el número " + entrada_3);
		}
		entradaEscaner.close();
		
		//Redondeo de los decimales
		double num1 = Double.parseDouble(entrada_1);
		double num2 = Double.parseDouble(entrada_2);
		int redondeo = Integer.parseInt(entrada_3);

		//En un principio se iba a utilizar un switch case, pero no se puede determinar redondeo que se introducido por pantalla.
		//Dependiendo del número de redondeo generara un numero para realizar el redondeo, es decir, si el numero es 3 de redondeo r sera 1000 para que al multiplicar por el el numero este redondeado a 3 decimales.
		for(int j = 0; j < redondeo ;j++)
		{
			r *= 10;
		}
			
		//Si los numeros tienen menos decimales a redondear, no se redondearan, es decir, si 2.54 es el num y el redondeo es 8 el numero se quedara en 2.54
		double num1R = Math.round(num1 * r) / r;
		double num2R = Math.round(num2 * r) / r;
		
		System.out.println("Los números redondeados: " + num1R + " y " + num2R);
		
		//Suma
		sumaNum(num1R, num2R);
		
		//Resta
		restaNum(num1R,num2R);
		
		//División
		divisionNum(num1R,num2R);
		
		//Multiplicación
		multiplicacionnNum(num1R,num2R);
		
		//Modulo
		moduloNum(num1R,num2R);
		
		//Mayor que
		mayorMenor(num1R,num2R);
	}
	
	/**
	 * 
	 * @param entrada: NUMERO INTRODUCIDO POR CONSOLA
	 * @return TRUE SI EL NUMERO ES UN INT PARA EL REDONDEO O FALSE SI NO LO ES
	 */
	private boolean validarNumero(String entrada) 
	{
		try
		{
			//comprueba si es integer
			Integer.parseInt(entrada);
			return true;
		}
		catch(NumberFormatException e)
		{
		  //not a double
			return false;
		}
	}

	/**
	 * 
	 * @param entrada: NUMERO INTRODUCIDO POR CONSOLA
	 * @return TRUE SI EL NUMERO ES UN DOUBLE PARA EL REDONDEO O FALSE SI NO LO ES
	 */
	public boolean validarDouble(String entrada)
	{
		try
		{
			//Comprueba si es double
		  Double.parseDouble(entrada);
		  return true;
		}
		catch(NumberFormatException e)
		{
		  //not a double
			return false;
		}
		
		
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void sumaNum(double num1, double num2)
	{
		double suma = num1 + num2;
		suma = Math.round(suma * r) / r;
		
		System.out.println("La suma de ambos números es: " + suma);
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void restaNum(double num1, double num2)
	{
		//Resta de ambos numeros
		double resta = num1 - num2;
		resta = Math.round(resta * r) / r;
		
		System.out.println("La resta de "+ num1 + "-" + num2+ " es: " + resta);
		
		double resta2 = num2 - num1;
		resta2 = Math.round(resta2 * r) / r;
		
		System.out.println("La resta de "+ num2 + "-" + num1+ " es: " + resta2);
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void divisionNum(double num1, double num2)
	{
		//Division de ambos numeros
		double div = num1 / num2;
		div = Math.round(div * r) / r;
		
		System.out.println("La división de "+ num1 + "/" + num2+ " es: " + div);
		
		double div2 = num2 / num1;
		div2 = Math.round(div2 * r) / r;
		
		System.out.println("La división de "+ num2 + "/" + num1+ " es: " + div2);
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void multiplicacionnNum(double num1, double num2)
	{
		//Multilplicacion de los números
		double mult = num1 * num2;
		mult = Math.round(mult * r) / r;
		
		System.out.println("La multiplicación de ambos números es: " + mult);
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void moduloNum(double num1, double num2)
	{
		//Modulo de los numeros
		double mod = num1 % num2;
		mod = Math.round(mod * r) / r;
		
		System.out.println("El modulo de ambos números es: " + mod);
	}
	
	/**
	 * 
	 * @param num1 : PRIMER NUMERO INTRODUCIDO POR CONSOLA
	 * @param num2 : SEGUNDO NUMERO INTRODUCIDO POR CONSOLA
	 */
	public void mayorMenor(double num1, double num2)
	{
		//Comprueba si cual es mayor y cual menor o si son iguales
		if(num1 > num2)
			System.out.println("El número " + num1 + " es mayor que " +  num2);
		else if(num1 < num2)
			System.out.println("El número " + num2 + " es mayor que " +  num1);
		else
			System.out.println("Los numeros son iguales");
	}
}
