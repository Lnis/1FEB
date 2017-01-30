package palabra;

public class NUltimasLetras {

public static void RecorrerUltimas(String palabra,int n){
		
		int longitud=palabra.length();
		int indi=0;
	
		indi=n-1;
		
		while(indi<longitud)
		{
			System.out.println(palabra.charAt(indi));
			indi++;			
		}
		
	}
}
