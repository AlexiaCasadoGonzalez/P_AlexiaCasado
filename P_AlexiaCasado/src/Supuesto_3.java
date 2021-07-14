import java.util.Calendar;

/**
 * ESTA CLASE SE ENCARGARA DE REALIZAR LOS EJERCICIOS DEL SUPUESTO 3, UTILIZANDO UN STRING TEXTO. ESTE EJERCICIO NO TENDRA METODOS YA QUE NO SE NECESITAN FUNCIONES COMPLICADAS PARA REALIZARLO
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Supuesto_3 
{
	//CONTRUCTOR
	public Supuesto_3()
	{
		
	}
	
	public void ejercicio_3()
	{
		String texto = "Java es un lenguaje de programación y una plataforma informática que fue comercializada por "
				+ "primera vez en 1995 por Sun Microsystems. Hay muchas aplicaciones y sitios web que no funcionarán, probablemente, "
				+ "a menos que tengan Java instalado y cada día se crean más. Java es rápido, seguro y fiable";

		System.out.println("Número de caracteres del texto: \n" + texto.length());//Cambiar número de caracteres con la funcion lenght
		System.out.println();
		System.out.println("Texto en mayusculas: \n" + texto.toUpperCase());//Cambiar el texto a mayusculas con UpperCase
		System.out.println();
		System.out.println("Texto en minusculas: \n" + texto.toLowerCase());//Cambiar el texto a minusculas con LowerCase
		System.out.println();
		
		//Hacemos un array con las palabras del texto, quitando las comas y los puntos.
		String textoSin = texto.replace(",", "");
		textoSin = texto.replace(".", "");
		String[] word = textoSin.split(" ");
		//Buscamos las palabras repetidas
		int count = 1; //Comienza uno porque siempre existira una de las palabras repetida
		
		System.out.println("Las palabras repetidas son: ");
		
		for(int i=0; i<word.length; i ++)     
	    {
	         for(int j=i+1; j<word.length; j++)
	         {
	            
		         if(word[i].equals(word[j]))//comparamos ambas palabras
		         {
		        	 count=count+1;
		               word[j]="0";//Remplazamos las palabras repetidas con ceros, para no volverlas a contar
		         }
	         }
	         
	         if(word[i]!="0" && count > 1)
	        	 System.out.print("'"+ word[i] + "' ");
	         
	         count=1;//Volvemos el contador a 1 otra vez     
	   }
		
		System.out.println("\n");
		System.out.println("Remplazamos 'Java' por 'Avaj': \n" + texto.replace("Java", "Avaj"));
		
		long t1, t2, dif;
		//Inicio del tiempo
		Calendar ahora1 = Calendar.getInstance();
        t1 = ahora1.getTimeInMillis();
        String concatTexto = texto;

		for(int n = 0; n<100;n++)
		{
			concatTexto = concatTexto.concat(texto);
		}
		
		//Fin del tiempo
		Calendar ahora2 = Calendar.getInstance();
        t2 = ahora2.getTimeInMillis();
        dif = t2 - t1;
        
        System.out.printf("\nHa tardado: %.3f segundos concatenar 100 veces el texto", (double)dif/1000);
        System.out.println("Número de caracteres del texto: \n" + concatTexto.length());
	}
}
