import java.util.Scanner;

/**
* 
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.0
 *
 */
public class ItemSeparator 
{
	Scanner inputScanner = new Scanner(System.in);
	//CONTRUCTOR
	public ItemSeparator()
	{
		
	}

	/**
	 * Para realizar este ejercicio se tuvo claro que debia utilizar split, pero solo debia permitir que se leyesen un tipo de cadena en especifico. Para ello se penso en utilizar regular expressions. A parte de expresiones regulares se podria usar un try
	 * y un catch para que cada vez que se introduca mal cadena salte un error.
	 */
	public void ejercicio_6()
	{
		String numDouble = "^[0-9]+(.|,)?[0-9]?$";
		String letras = "[A-Za-z ]*";
		String numInt = "^-?\\d+$";
		String texto;
		System.out.println("Escriba un texto");
		texto = inputScanner.nextLine();
		
		//Comprobamos que contiene $$##
		if(texto.contains("$$##") )
		{
			String[] cadena = texto.split("\\$\\$\\#\\#");

			//Comprobamos que solo tiene 3 valores la cadena
			if(cadena.length == 3)
			{
				//Comprobamos que la primera cadena es solo letras, la segunda un double y la tercera un numero int
				if(cadena[0].matches(letras) && cadena[1].matches(numDouble) && cadena[2].matches(numInt))
				{
					String name = cadena[0];
					Double price = Double.parseDouble(cadena[1]);
					int quantity = Integer.parseInt(cadena[2]);
					
					System.out.println("Item Name: " + name);
					System.out.println("Item Price: " + price);
					System.out.println("Quantity: " + quantity);
				}
				else
					System.out.print("No ha introduccido un nombre, un precio y una cantidad correctamente");
			}
			else
				System.out.print("No ha introducido correctamente la cadena");
			
		}
		else
			System.out.print("El texto no contiene $$##");
		
	}
	
}
