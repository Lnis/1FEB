package ImprimirArgumentos;

public class Argumentos {

	public static boolean palabraConI(String palabra)
	{
		boolean esta=false;
		int indice=0;
		int x=palabra.length();
		while((!esta) && (indice<x))
		{
			if(palabra.charAt(indice)=='i'){
				esta=true;
			}
			indice++;
		}
		return esta;
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)
		{
			if(palabraConI(args[i]))
				System.out.println(args[i]);
		}

	}

}
