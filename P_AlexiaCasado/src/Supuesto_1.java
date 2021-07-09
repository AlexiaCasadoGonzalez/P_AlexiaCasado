import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
	 * EJERCICIO 1: SE REALIZARA UN CONTROL DE ERRORES DE LA FECHA INTRODUCCIDA, PARA ELLO SE USARA UN WHILE. DESPUES INVOCARA LOS METODOS QUE CUMPLAN TODOS LAS PARTES DEL EJERCICIO
	 */
	public void Ejercicio_1()
	{
		boolean i,f1,f2;
		Scanner entradaEscaner = new Scanner (System.in);
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String entrada_1 = "";
		String entrada_2 = "";
		Date fecha_1 = null,fecha_2 = null;
		
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
		
		//Pasamos los string al formato Date
		try {
			fecha_1 = format.parse(entrada_1);
			fecha_2 = format.parse(entrada_2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Calculo de la diferencia de fechas
		long dias = diferenciaFechas(fecha_1, fecha_2);
		System.out.println(dias);
		
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
	
	/**
	 * 
	 * @param fecha_1: PRIMERA FECHA INTRODUCIDA POR CONSOLA
	 * @param fecha_2: SEGUNDA FECHA INTRODUCIDA POR CONSOLA
	 * @return INT CON EL NUMERO DE DIAS DE DIFERENCIA ENTRE LAS DOS FECHAS
	 */
	public long diferenciaFechas(Date fecha_1, Date fecha_2)
	{
		LocalDate dateBefore = fecha_1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate dateAfter = fecha_2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		long dias = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
		return dias;
		
	}
}
