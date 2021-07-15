import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase tiene un menu para la tienda con añadir,borrar, editar y ver clientes. Para un mejor funcionamiento se podria enlazar con una BBDD en la nube como los servicio de AWS o Firebase, sin base de datos no habra
 * persistencia en los datos añadidos
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 2.0
 *
 */
public class Supuesto_4 
{
	public static List<Cliente> listaClientes = new ArrayList<Cliente>();
	Scanner inputScanner = new Scanner(System.in);
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
	           op = inputScanner.nextInt();
	            
	           switch(op)
	           {
	           
	               case 1:
	                   System.out.println("Has seleccionado añadir cliente");
	                   aniadirCliente();
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado borrar cliente");
	                   borrarCliente();
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado editar cliente");
	                   editarCliente();
	                   break;
	                case 4:
		               System.out.println("Has seleccionado listar cliente");
		               listaCliente();
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
	/**
	 * Añade un cliente, con los datos 
	 */
	public void aniadirCliente()
	{
		boolean salir = false;
		String dni = null,nombre = null,apellidos = null,tipo = null,fecha = null,cuota = null;
		
		//Validaremos todos los datos uno a uno, y si uno no es correcto se debera introduccir correctamente
		//Se han utilizado varios bucles, uno para el DNI otro para el tipo de cliente y por ultimo la fecha, tanto el nombre como los apellidos no pueden estar incorrectos.
		while(!salir)
		{
			System.out.println("Introduzca el DNI del cliente");
			dni = inputScanner.next();
			
			if(validarDni(dni) == true && dniRpetido(dni) == true)//VALIDACIÓN DEL DNI
				salir= true;		
			else
				System.out.println("Ha introduccido mal el DNI o esta repetido");
			
		}
		
		System.out.println("Introduzca el nombre del cliente");
		nombre = inputScanner.next();
		
		System.out.println("Introduzca los apellidos del cliente");
		apellidos = inputScanner.next();

		//Cambiamos salir a false para entrar en el bucle
		salir = false;
		while(!salir)
		{
				System.out.println("Introduzca el tipo del cliente:Registrado (R) o Socio (S)");
				tipo = inputScanner.next();
				
				if(tipo.contentEquals("R") || tipo.contentEquals("S"))//VALIDACIÓN DE TIPO DE CLIENTE
					salir = true;
				else
					System.out.println("Ha introduccido mal el tipo, escriba R o S dependiendo que desee.");
		}
		
		//Cambiamos salir a false para entrar en el bucle
		salir = false;
		while(!salir)
		{
			System.out.println("Introduzca la fecha en formato (yyyy/MM/dd) de alta");
			fecha = inputScanner.next();
			
			if(validarFecha(fecha) == true)//VALIDAR DEL FORMATO DE LA FECHA
				salir = true;
			else
				System.out.println("Ha introduccido mal la fecha");
		}
		
		//Ponemos la cuota dependiendo del tipo del cliente
		if(tipo.contentEquals("R"))
		{
			tipo = "Registrado";
			cuota = "100 euros";
		}
		else if(tipo.contentEquals("S"))
		{
			tipo = "Socio";
			cuota = "Ilimitada";
		}
			
		
		//Añadimos el cliente llamando a su contructor y lo añadimos a una lista de Clientes
		System.out.println(dni +  " " + nombre  + " " + apellidos + " " + tipo  + " " + fecha);
		Cliente client = new Cliente(dni, nombre, apellidos, tipo, fecha,cuota);
		listaClientes.add(client);
	}
	
	/**
	 * Elimina un cliente de la lista de clientes
	 */
	public void borrarCliente() 
	{
		String dni;
		
		System.out.println("Introduzca el DNI del cliente");
		dni = inputScanner.next();
		
		for(int i = 0; i < listaClientes.size();i++)
		{
			if(listaClientes.get(i).DNI == dni)
				listaClientes.remove(i);
				
		}
	}
	
	/**
	 * Mostrar todos los clientes
	 */
	public void listaCliente()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("|   DNI   |   NOMBRE   |   APELLIDOS   |   TIPO   |   CUOTA   |   FECHA DE ALTA  |");
		for(int i=0;i<listaClientes.size();i++)
		{
			System.out.println("--------------------------------------------------");
			System.out.println("|" + listaClientes.get(i).DNI+ "|"+ listaClientes.get(i).nombre +"|"+ listaClientes.get(i).apellidos+ "|"+ listaClientes.get(i).tipo +"|"+ listaClientes.get(i).cuotaMaxima + "|"+ listaClientes.get(i).fechaAlta+ "|");
			System.out.println("--------------------------------------------------");
		}
	}

	public void editarCliente()
	{
		
	}
	
	/**
	 * Reutilizacion de codigo del supuesto 1
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
	
	/**
	 * Validamos el dni
	 * @param dni: DNI DEL CLIENTE
	 * @return TRUE SI EL DNI ES CORRECTO FALSE SI EL DNI NO ES CORRECTO
	 */
	public boolean validarDni(String dni)
	{
	    //Variables
        char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};  
        String num= "";
        int ind = 0;  
 
        if(dni.length() == 8) 
        {
        	dni = "0" + dni;
       }
        
        //Comprobar que el ultimo digito es una Letra
        if (!Character.isLetter(dni.charAt(8)))
        {
             return false;  
        }
  
        //Comprobar que tenga nueve digitos
        if (dni.length() != 9)
        {   
             return false;
        }  
 
        // Los 8 primero son numeros
        for (int i=0; i<8; i++)
        {
   
             if(!Character.isDigit(dni.charAt(i)))
             {
                   return false;    
             }
             
             num += dni.charAt(i);     
        }
  
        //Comprobar si la letra corresponde a la posicion del DNI
        ind = Integer.parseInt(num);
        ind %= 23;
        if ((Character.toUpperCase(dni.charAt(8))) != letraDni[ind])
        {
            return false;
        } 
        
        //Si todo sale correcto enviara un true
        	return true;
   }
	
	/**
	 * Comprobamos si el Dni es repetido
	 * @param dni: Dni del cliente
	 * @return True si el dni no esta repetido False si esta repetido en la lista
	 */
	public boolean dniRpetido(String dni)
	{
		for(int i = 0; i < listaClientes.size();i++)
		{
			if(listaClientes.get(i).DNI == dni)
				return false;
		}
		return true;
	}
}
