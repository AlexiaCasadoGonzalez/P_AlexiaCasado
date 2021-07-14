import java.text.ParseException;

/**
 * 
 */

/**
 * @author Alexia Casado Gonzalez
 *
 */
public class main 
{

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Menu m = new Menu();
		try {
			m.inicio();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
