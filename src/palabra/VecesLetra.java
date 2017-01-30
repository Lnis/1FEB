package palabra;

public class VecesLetra {
	
	public static int Contenida (String palabra,char letra)
	{
		int longitud=palabra.length();
		int indi=0;
		int cantidad=0;
		
		while(indi<longitud)
		{
			if(letra==palabra.charAt(indi))
			{
				cantidad++;
			}
			indi++;
		}
		return cantidad;
	}

}
