import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
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
	    Supuesto_3 s3 = new Supuesto_3();
	    Supuesto_4 s4 = new Supuesto_4();
	    Supuesto_5 s5 = new Supuesto_5();
	    Supuesto_6 s6 = new Supuesto_6();
	    s6.ejercicio_6();
	    /*while(!salir)
	       {
	            
	           System.out.println("1. Supuesto 1");
	           System.out.println("2. Supuesto 2");
	           System.out.println("3. Supuesto 3");
	           System.out.println("4. Supuesto 4");
	           System.out.println("5. Supuesto 5");
	           System.out.println("6. Supuesto 6");
	            
	           System.out.println("Escribe una de las opciones");
	           op = sn.nextInt();
	            
	           switch(op)
	           {
	           
	               case 1:
	                   System.out.println("Has seleccionado la supuesto 1");
	           			s1.ejercicio_1();
	           			salir=true;
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la supuesto 2");
	                   s2.ejercicio_2();
	                   salir=true;
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la supuesto 3");
	                   s3.ejercicio_3();
	                   salir=true;
	                   break;
	                case 4:
		               System.out.println("Has seleccionado la supuesto 4");
		               s4.ejercicio_4();
		               salir=true;
		               break;
	                case 5:
		               System.out.println("Has seleccionado la supuesto 5");
		               s5.ejercicio_5();
		               salir=true;
		               break;
		            case 6:
		               System.out.println("Has seleccionado la supuesto 6");
		               s6.ejercicio_6();
		               salir=true;
		               break;
	                default:
	                   System.out.println("Solo números entre 1 y 6");
	           }
	            
	       }*/
	       sn.close();
	       
	}
}
