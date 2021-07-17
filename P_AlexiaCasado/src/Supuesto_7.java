import java.util.Arrays;
import java.util.Scanner;

/**
 * Este metodo se encargara de comprobar si el número es kaprekar y hacerlo kaprekar si no lo es
 */
/**
 * @author Alexia Casado Gonzalez
 * @version 1.0
 *
 */
public class Supuesto_7 
{
	Scanner inputScanner = new Scanner(System.in);
	//CONTRUCTOR
	public Supuesto_7()
	{
		
	}

	/**
	 * Para resolver este ejercicio primero se investigo que era una numero kaprekar. Para poder resolverlo debemos basarnos en el algoritmo de Kaprekar que consite en :
	 * 1. Escoger 4 digitos diferentes
	 * 2. Contruir con esos cuatro digitos, el número mayor y el número menor
	 * 3. Restar el mayor menos le menor de los numeros anteriores, si el número es 6174 es un número kaprecar sino con el resultado de la resta volvemos al paso 2.
	 * Este algoritmo converge en un numero kaprekar en menos de 8 iteraciones
	 */
	public void ejercicio_7()
	{
		
        int[] numArray = new int[4];
        int numKapre;
        String numKapreS = "";
        
        //Recogemos los numeros
		System.out.println("Por favor escriba 4 números diferentes uno por uno:");
        for(int i = 0; i < 4; i++)
        {
        	System.out.print("Escriba el número "+i +":	");
        	numArray[i]=inputScanner.nextInt();
        }
		
        //Comprovamos que el primer numero introducido no es 6174
        for (int num : numArray)
        	numKapreS = numKapreS+Integer.toString(num);        
        numKapre = Integer.parseInt(numKapreS);
        
        if(numKapre == 6174)
        	System.out.println("El número "+numKapre+" es Kaprekar");
        else
        {
        	//Solo 8 iteraciones para hallar el numero Kaprecar
            for (int i = 1; i < 9; i++)
            {
                int kap = isKaprekar(numArray);
                
                //comprobamos que el el mismo numero
                if(Integer.valueOf(kap).equals(6174))
                {
                    System.out.println("Iteración "+i+" el número "+ numKapre +" es Kaprekar");
                    break;
                }
                
                System.out.println("El número introducido no era Kaprekar. Se intentara con la resta de su mayor y menor numero: "+ kap);
                numArray = intArray(kap);
            }
        }
		
		
	}

	/**
	 * 
	 * @param numArray: Recibimos el array con los números introducidos por consola
	 * @return devolvemos la resta de el mayor y menor número creado con el array de números
	 */
	private int isKaprekar(int[] numArray) 
	{
		String numMenorS="",numMayorS="";
		int numMenor,numMayor;
		
		//Ordenamos de menor a mayor con sort
		Arrays.sort(numArray);
        
        //Pasamos el array a un int, primero lo pasamos a string para poder añadir detras los número y luego lo pasaremos a int para restarlo.
        for (int num : numArray)
        	numMenorS = numMenorS+Integer.toString(num);        
        numMenor = Integer.parseInt(numMenorS);
        
        //System.out.print("Menor:" + numMenor);
        
        //Calculamos el array al reves(mayor a menor).        
        for (int x = 0; x < numArray.length; x++) 
        {
            for (int i = 0; i < numArray.length-x-1; i++)
            {
                if(numArray[i] < numArray[i+1]){
                    int tmp = numArray[i+1];
                    numArray[i+1] = numArray[i];
                    numArray[i] = tmp;
                }
            }
        }
        
        
        for (int num : numArray)
        	numMayorS=numMayorS+Integer.toString(num);
        numMayor = Integer.parseInt(numMayorS);
     
        //System.out.print("Mayor:" + numMayor);
        
        return numMayor-numMenor;
	}
	
	/**
	 * 
	 * @param kap: Número que no es kaprecar para volverlo array y volver a intentar que sea kaprecar
	 * @return array de el número que no es kaprekar.
	 */
	private int[] intArray(int noKap) 
	{
		String numS= Integer.toString(noKap);
        int num = numS.length();
        int[] arrayInt=new int[num];
        
        //Pasamos la resta de los dos numeros a un nuevo array, para poder seguir probando el número kaprekar
        for (int i=0;i<num;i++)
            arrayInt[i]=Integer.parseInt(numS.substring(i,i+1));

        return arrayInt;
	}

}
