import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ESTA CLASE SE ENCARGARA DE MANEJAR FECHAR EN FORMATO DATE Y UTILIZANDO CALENDAR, PARA CUMPLIR LAS DIFERENTES PARTES DE EJERCICIO.
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.1
 *
 */
public class Supuesto_1 
{
	
	DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	/**
	 * CONSTRUCTOR
	 */
	public Supuesto_1()
	{
		
	}
	
	/**
	 * EJERCICIO 1: SE REALIZARA UN CONTROL DE ERRORES DE LA FECHA INTRODUCCIDA, PARA ELLO SE USARA UN WHILE. DESPUES INVOCARA LOS METODOS QUE CUMPLAN TODOS LAS PARTES DEL EJERCICIO
	 * @throws ParseException controlar los erros de Date
	 */
	public void ejercicio_1() throws ParseException
	{
		//Inicializamos variables
		boolean i = false,f1,f2;
		Scanner entradaEscaner = new Scanner (System.in);
		String entrada_1 = "";
		String entrada_2 = "";
		Date fecha_1 = null,fecha_2 = null;
		
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
			else if(f1 == false && f2 == false)
				System.out.println("Ha introducido el formato de las fechas de forma erronea");
			else if(f1 == false)
				System.out.println("Ha introducido el formato de la fecha " + entrada_1 +" de forma erronea");
			else if(f2 == false)
				System.out.println("Ha introducido el formato de la fecha " + entrada_2 +" de forma erronea");
		}
		
		entradaEscaner.close();
		//Pasamos los string al formato Date
		fecha_1 = format.parse(entrada_1);
		fecha_2 = format.parse(entrada_2);
		
		//Calculo de la diferencia de fechas
		long dias = diferenciaFechas(fecha_1, fecha_2);
		System.out.println("");
		System.out.println("Diferencia de dias entre las dos fechas: " + dias +" dias");
		System.out.println("");
		
		//Inicio y fin de año
		System.out.println("Inicio de año de la fecha " + entrada_1+ ": " + inicioFecha(fecha_1));
		System.out.println("Inicio de año de la fecha " + entrada_2+ ": " + inicioFecha(fecha_2));
		
		System.out.println("Final de año de la fecha " + entrada_1+ ": " + finFecha(fecha_1));
		System.out.println("Final de año de la fecha " + entrada_2+ ": " + finFecha(fecha_2));
		System.out.println("");
		
		//Dias desde comenzo y finalizo el año
		System.out.println("Fecha: "+ entrada_1);
		diasInicioFin(fecha_1);
		System.out.println("Fecha: "+ entrada_2);
		diasInicioFin(fecha_2);
		System.out.println("");
		
		//Numero de dias
		anioBisiesto(fecha_1);
		anioBisiesto(fecha_2);
		System.out.println("");
		
		//Numero de semanas entre las fechas
		long semanas = semanasFecha(fecha_1, fecha_2);
		System.out.println("Diferencia de semanas entre las dos fechas: " + semanas +" semanas");
	}
	/**
	 * Metodo que validara el formato de las fechas
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
	 * Metodo que calcurara la diferencia entre fechas
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
	
	/**
	 * Metodo que mostrara el inicio de fecha. En este metodo de intento utilizar Date.getYear() pero esta deprecaed, entonces se utilizo Calendar.
	 * @param fecha: INTRODUCIDA POR CONSOLA
	 * @return FECHA DE INCIO DE AÑO
	 */
	public String inicioFecha(Date fecha)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int anio= cal.get(Calendar.YEAR);
		String anioS = anio +"/01/01";
		
		return anioS;
		
	}
	
	/**
	 * Metodo que mostrara el fin de fecha. En este metodo de intento utilizar Date.getYear() pero esta deprecaed, entonces se utilizo Calendar.
	 * @param fecha: INTRODUCIDA POR CONSOLA
	 * @return FECHA DE FIN DE AÑO
	 */
	public String finFecha(Date fecha)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int anio= cal.get(Calendar.YEAR);
		String anioS = anio +"/12/31";
		return anioS;
		
	}
	
	/**
	 * Metodo que comprueba cuentos dias tiene el año, es decir si es bisiesto o no.
	 * @param fecha: INTRODUCIDA POR CONSOLA
	 */
	public void anioBisiesto(Date fecha)
	{
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		int anio= cal.get(Calendar.YEAR);
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto, tiene 366 dias");
		else
			System.out.println("El año no es bisiesto, tiene 365 dias");
		
	}
	
	/**
	 * Metodo que calcula las semanas de diferencia entre las dos fechas. En este caso se intento usar Date.getWeek() pero esta deprecated, por lo tanto se uso LocalDate
	 * @param fecha_1: PRIMERA FECHA INTRODUCIDA POR CONSOLA
	 * @param fecha_2: SEGUNDA FECHA INTRODUCIDA POR CONSOLA
	 * @return Número de semanas entre las fechas
	 */
	public long semanasFecha(Date fecha_1, Date fecha_2) 
	{
		LocalDate dateBefore = fecha_1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate dateAfter = fecha_2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		long semanas = ChronoUnit.WEEKS.between(dateBefore, dateAfter);
		return semanas;
		
	}
	
	/**
	 * Metodo que calcula los dias que dan para fin de año y cuando dias han pasado desde inicio de año
	 * @param fecha: FECHA INTRODUCIDA POR CONSOLA
	 */
	public void diasInicioFin(Date fecha)
	{
		String inicio = inicioFecha(fecha);
		String fin = finFecha(fecha);
		Date fechaInicio = null,fechaFin = null;
		
		try {
			fechaInicio = format.parse(inicio);
			fechaFin = format.parse(fin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reutilización de otros metodos
		long diasInicio = diferenciaFechas(fechaInicio,fecha);
		long diasFin = diferenciaFechas(fecha,fechaFin);
		
		System.out.println("Días de desde el inicio de año: " + diasInicio);
		System.out.println("Días de hasta el fin de año: " + diasFin);
	}
}
