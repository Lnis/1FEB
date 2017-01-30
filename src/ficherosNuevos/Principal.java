package ficherosNuevos;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		File file=null;
		String[] ficheros=null;
		/**
		 * Tenemos que crearnos un array, porque el retorno del método .list() es un array de String de los nombres de
		 * archivos y directorios de la carpeta que le indicamos
		 */
		file= new File("C:/Users/Alumno/workspace/FicherosVarios");
		ficheros=file.list();
		for(int i=0; i<ficheros.length; i++){
			System.out.println(ficheros[i]);
		}
	}

}
