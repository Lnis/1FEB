package edu.femxa.herencia;

public class Cesar2 {
	
	public void mostrarCodChars (String cadena)
	{
		int longi =cadena.length();
		int numero_caract=0;
		char caracter=0;
		
		for(int pos=0; pos<longi;pos++)
		{
			caracter=cadena.charAt(pos);
			numero_caract=(int) caracter;
			System.out.println(cadena.charAt(pos)+" = "+numero_caract);
		}
	}
	
	public String CodigoCesar(String cadena, int codigo)
	{
		String cifrado = "";
		int longi =cadena.length();
		int numero_caract=0;
		char caracter=0;
		int pos=0;
		
		for(pos=0; pos<longi;pos++)
		{
		System.out.print(cadena.charAt(pos));
		}
		
		System.out.println();
		
		for(pos=0; pos<longi;pos++)
		{
			caracter=cadena.charAt(pos);
			if(caracter!=' '){
				numero_caract=(int) caracter + codigo;
				
			}
			else
			{
				numero_caract=cadena.charAt(pos);
			}
		//	System.out.println(cadena.charAt(pos)+" = "+(char)numero_caract);
		//	System.out.print((char)numero_caract);
			cifrado=cifrado+(char)numero_caract;
			
		}
		return cifrado;
	}
	
	public static void main(String[] args) {
		Cesar2 cesar=null;
		String texto_final=null;
		
		cesar=new Cesar2();
	//	cesar.mostrarCodChars("LOLIPOP");
		texto_final=cesar.CodigoCesar("BUENAS TARDES",3);
		System.out.print(texto_final);
	}
	
	
	

}
