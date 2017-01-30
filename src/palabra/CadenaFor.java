package palabra;

public class CadenaFor {

	public static void ImprimirFor (String palabra)
	{
		int longitud=palabra.length();
		
		for(int i=0; i<longitud;i++)
		{
			System.out.println(palabra.charAt(i));
		}
	}
}
		
