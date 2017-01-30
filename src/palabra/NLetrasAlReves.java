package palabra;

public class NLetrasAlReves {
	
	public static void muestraRevesN(String palabra, int n)
	{
		int lim_sup=palabra.length()-1;
		int lim_inf=palabra.length()-n;
		
		while(lim_sup>=lim_inf)
		{
			System.out.println(palabra.charAt(lim_sup));
			lim_sup--;
		}
	}

}
