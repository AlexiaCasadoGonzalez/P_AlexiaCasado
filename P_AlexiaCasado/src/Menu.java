import java.text.ParseException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Alexia Casado González
 * @version 1.2
 */
public class Menu 
{
	/**
	 * CONTRUCTOR
	 */
	public Menu() 
	{
		
	}
	
	public void inicio() throws ParseException
	{
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int op;
	    Supuesto_1 s1 = new Supuesto_1();
	    Supuesto_2 s2 = new Supuesto_2();
	        
	      while(!salir)
	       {
	            
	           System.out.println("1. Supuesto 1");
	           System.out.println("2. Supuesto 2");
	           System.out.println("3. Supuesto 3");
	           System.out.println("4. Supuesto 4");
	           System.out.println("5. Supuesto 5");
	            
	           System.out.println("Escribe una de las opciones");
	           op = sn.nextInt();
	            
	           switch(op)
	           {
	               case 1:
	                   System.out.println("Has seleccionado la supuesto 1");
	           			s1.Ejercicio_1();
	           			salir=true;
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la supuesto 2");
	                   s2.Ejercicio_2();
	                   salir=true;
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la supuesto 3");
	                   break;
	                case 4:
		               System.out.println("Has seleccionado la supuesto 4");
		               break;
	                case 5:
		               System.out.println("Has seleccionado la supuesto 5");
		               break;
	                default:
	                   System.out.println("Solo números entre 1 y 6");
	           }
	            
	       }
	       sn.close();
	       
	}
}
