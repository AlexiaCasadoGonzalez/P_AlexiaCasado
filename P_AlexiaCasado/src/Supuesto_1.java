import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ESTA CLASE SE ENCARGARA DE MANEJAR FECHAR EN FORMATO DATE
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.0
 *
 */
public class Supuesto_1 
{
	
	
	/**
	 * CONSTRUCTOR
	 */
	public Supuesto_1()
	{
		
	}
	
	/**
	 * EJERCICIO 1: SE REALIZARA UN CONTROL DE ERRORES DE LA FECHA INTRODUCCIDA, PARA ELLO SE USARA UN WHILE
	 */
	public void Ejercicio_1()
	{
		boolean i,f1,f2;
		Scanner entradaEscaner = new Scanner (System.in); 
		String entrada_1 = "";
		String entrada_2 = "";
		
		i = false;
		
		while(i != true)
		{
			System.out.println ("Por favor introduzca una fecha por teclado:");
			entrada_1 = entradaEscaner.nextLine ();
			f1 = validarFecha(entrada_1);
			
			System.out.println ("Por favor introduzca una fecha por teclado:");
			entrada_2 = entradaEscaner.nextLine ();
			f2 = validarFecha(entrada_2);
			
			//Mensajes de error si las fechas son incorrectas
			if(f1 == true && f2 == true)
				i= true;
			else if(f1 == false)
				System.out.println("Ha introducido el formato de la fecha " + entrada_1 +" de forma erronea");
			else if(f2 == false)
				System.out.println("Ha introducido el formato de la fecha " + entrada_2 +" de forma erronea");
			else if(f1 == false && f2 == false)
				System.out.println("Ha introducido el formato de las fechas de forma erronea");
		}
		
		 System.out.print(entrada_1 + " " + entrada_2);
		
	}
	/**
	 * 
	 * @param fecha: RECIBIRA LE FECHA INTRODUCIDA POR CONSOLA
	 * @return TRUE SI ES VALIDO EL FOMATO FALSE SI NO ES VALIDO
	 */
	public boolean validarFecha(String fecha)
	{
		try 
		{
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } 
		catch (ParseException e) 
		{
            return false;
        }
        return true;
		
	}
}
