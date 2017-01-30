package palabra;

public class LetrasPalabra {
	
	
	public static void Imprimir(String palabra){
		
		int longitud=palabra.length();
		int indi=0;
		boolean encs=false;
		
		while(indi<longitud && !encs)
		{
			if(palabra.charAt(indi)=='s')
			{
				encs=true;
			}
			System.out.println(palabra.charAt(indi));
			indi++;			
		}
		
	}



}