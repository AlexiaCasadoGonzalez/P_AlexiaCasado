import java.util.Scanner;

/**
 * ESTA CLASE SE ENCARGARA DE RELIZAR DIFERENTES OPERACIONES CON DIFERENTES NÚMEROS
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.0
 *
 */
public class Supuesto_2 
{
	//CONSTRUCTOR
	public Supuesto_2()
	{
		
	}
	/**
	 * 
	 */
	public void Ejercicio_2()
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
		double r = 1;
		//En un principio se iba a utilizar un switch case, pero no se puede determinar redondeo que se introducido por pantalla.
		//Dependiendo del número de redondeo generara un numero para realizar el redondeo, es decir, si el numero es 3 de redondeo r sera 1000 para que al multiplicar por el el numero este redondeado a 3 decimales.
		for(int j = 0; j < redondeo ;j++)
		{
			r *= 10;
		}
			
		//Si los numeros tienen menos decimales a redondear, no se redondearan, es decir, si 2.54 es el num y el redondeo es 8 el numero se quedara en 2.54
		double num1R = Math.round(num1 * r) / r;
		double num2R = Math.round(num2 * r) / r;
		
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
	
	
}
