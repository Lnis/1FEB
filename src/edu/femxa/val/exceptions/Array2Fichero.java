package edu.femxa.val.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {
	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		
		String[] lista_cadena = new String [4];
		int i=0;
		FileReader filereader=new FileReader (file);
		BufferedReader br = new BufferedReader(filereader);
		while (br.ready()){
			lista_cadena[i] = br.readLine();
			System.out.println(lista_cadena[i]);
			i++;
		}
		br.close();
		filereader.close();
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena) throws IOException
	{
		boolean ok = false;
		File file2 = new File("C:\\Users\\Alumno\\git\\16DIC\\Carpetilla\\Envio\\Lineas2.txt");
		int longi=lista_cadena.length;
		FileWriter filewriter=new FileWriter (file2);
		BufferedWriter bw = new BufferedWriter(filewriter);
		for (int i=0; i<longi; i++){
			bw.write(lista_cadena[i]);
			bw.newLine();
		}
		bw.close();
		filewriter.close();
		return ok;
		
		
	}

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Alumno\\git\\16DIC\\Carpetilla\\Envio\\Lineas.txt");
		String[] lista= null;
		lista=fromFichero2Array(file);
		fromArray2Fichero(lista);
		
	}
}
