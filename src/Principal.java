import java.io.File;


public class Principal {

	public static void main(String[] args) {
		File file=null;
		file= new File("Carpetilla");
		/**
		 * Tenemos que crearnos un array, porque el retorno del m�todo .list() es un array de String de los nombres de
		 * archivos y directorios de la carpeta que le indicamos
		 */
		String[] ficheros=null;
		ficheros=file.list();
		for(int i=0; i<ficheros.length; i++){
			System.out.println(ficheros[i]);
		}

	}

}
