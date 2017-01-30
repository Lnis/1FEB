package palabra;

public class NPrimerasLetras {
	
	public static void RecorrerPrimeras (String palabra,int n){
		
		int indi=0;
		
		while(indi<n && indi<palabra.length())
		{
			System.out.println(palabra.charAt(indi));
			indi++;			
		}
	}
}
