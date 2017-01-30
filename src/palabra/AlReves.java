package palabra;

public class AlReves {
	
	public static void Invertir(String palabra)
	{
		int	contador=0;
		
		for(contador=palabra.length()-1;contador>=0;contador--)
		{
			System.out.println(palabra.charAt(contador));
		}
	}
}
