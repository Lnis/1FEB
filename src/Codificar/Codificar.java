package Codificar;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Codificar {

	public static void main(String[] args) throws IOException {
		
		File archivo = new File("C:\\Users\\Alumno\\git\\16DIC\\Carpetilla\\Envio\\TopSecret.txt");
		FileReader filereader=new FileReader (archivo);
		File file=null;
		String[] ficheros=null;

		file= new File("C:/Users/Alumno/git/16DIC/Carpetilla/Envio");
		ficheros=file.list();
		
		for(int i=0; i<ficheros.length; i++){
			String codificado = codifica(ficheros[i]);
			System.out.println(codificado);
			ficheros[i]=codificado;
		}
		
		for(int i=0; i<ficheros.length; i++){
			String decodificado = decodifica(ficheros[i]);
			System.out.println(decodificado);
			ficheros[i]=decodificado;
		}
		
		int a = filereader.read();
		int charAux;
		int suma=0;
		int codificado=0;
		while(a!=-1){

			codificado=codificaMensaje(a);
			suma = suma+codificado;
			char aux=(char) codificado;
			System.out.print(aux);
			a=filereader.read();
		}
		filereader.close();
		
		System.out.println("\n");
		
/*		int b = filereader2.read();
		int resta=0;
		int decodificado=0;
		
		while(b!=-1){

			decodificado=decodificaMensaje(b);
			resta = resta+decodificado;
			char aux2=(char) decodificado;
			System.out.print(aux2);
			b=filereader2.read();
		
		}
		filereader2.close();*/
	}
	
		public static String codifica (String cadena)
		{
			char letra=0;
			String codificada="";
			int longi=cadena.length();
			for(int i=0; i<longi; i++){
				letra=(char) (cadena.charAt(i)-14);
				codificada+=letra;
			}
			return codificada;
		}
		
		public static String decodifica (String cadena)
		{
			char letra=0;
			String decodificada="";
			int longi=cadena.length();
			for(int i=0; i<longi; i++){
				letra=(char) (cadena.charAt(i)+14);
				decodificada+=letra;
			}
			return decodificada;
		}
		
		public static int codificaMensaje(int a) {
			int code=a+6;
			return code;
		}
		
		private static int decodificaMensaje(int b) {
			int code=b-6;
			return code;

	}
}





	
