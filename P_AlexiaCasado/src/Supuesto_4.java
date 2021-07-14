import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Supuesto_4 
{
	public static List<Cliente> listaClientes = new ArrayList<Cliente>();
	Scanner sn = new Scanner(System.in);
	//CONTRUCTOR
	public Supuesto_4()
	{
		
	}
	
	public void ejercicio_4()
	{
		
		boolean salir = false;
		int op;
		
		while(!salir)
		{
	           System.out.println("1. Añadir Cliente");
	           System.out.println("2. Borrar Cliente");
	           System.out.println("3. Editar Cliente");
	           System.out.println("4. Listar Cliente");
	           System.out.println("5. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           op = sn.nextInt();
	            
	           switch(op)
	           {
	           
	               case 1:
	                   System.out.println("Has seleccionado añadir cliente");
	                   aniadirCliente();
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado borrar cliente");
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado editar cliente");
	                   break;
	                case 4:
		               System.out.println("Has seleccionado listar cliente");
		               break;
	                case 5:
		               System.out.println("Hasta la proxima!");
		               salir = true;
		               break;
	                default:
	                   System.out.println("Solo números entre 1 y 5");
	           }
	            
		}
	}
	
	public void aniadirCliente()
	{
		System.out.println("Introduzca el DNI, el nombre, los apellidos,tipo de cliente y la fecha de alta del cliente separado por comas");
		String datos = sn.nextLine();
		String[] datosArray = datos.split(",");/*
		String DNI = datosArray[0];
		String nombre = datosArray[1];
		String apellidos = datosArray[2];
		String tipo = datosArray[3];
		String fecha = datosArray[4];
		
		System.out.println(DNI +  " " + nombre  + " " + apellidos + " " + tipo  + " " + fecha);*/
		//Cliente client = new Cliente(dni, null, null, null, null);
		//listaClientes.add(e)
	}
}
