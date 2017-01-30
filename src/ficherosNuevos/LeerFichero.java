package ficherosNuevos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) throws IOException {
		
		File archivo = new File("C:\\Users\\Alumno\\git\\16DIC\\Carpetilla\\Frase.txt");
		FileReader filereader=new FileReader (archivo);
		
		int a = filereader.read();
		int b = filereader.read();
		char c = (char)a;	//CASTING!: Conversión de el valor de a en una letra
		char d = (char)b;
/*		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);*/
		
		int i=0;
		int charAux;
		int suma=0;
		i=filereader.read();
		while(i!=-1){

			char aux=(char) i;
			suma = suma+i;
			System.out.println("La letra actual es "+aux);
			i=filereader.read();
		
		}
		filereader.close();
	}	
}
