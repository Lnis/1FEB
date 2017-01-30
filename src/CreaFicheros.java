import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreaFicheros {

	public static void main(String[] args) {
		File file=null;
		String nombre = null;
		Scanner name = null;
		int borra=1;
		System.out.println("Introduce nombre del archivo a crear: ");
		name = new Scanner(System.in);
		nombre=name.nextLine();
		file= new File(".", nombre);
		newFile(file);
		System.out.println("Para borrar el archivo pulse 0");
		name = new Scanner(System.in);
		borra=name.nextInt();
		if(borra==0)
			deleteFile(file);
		
	}

	public static void newFile(File file){
		
		try {
			if(file.createNewFile()){
				System.out.println("Se ha creado el archivo");
			}
			else{
				System.out.println("No se ha creado");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteFile(File file){
		if(file.delete()){
			System.out.println("Archivo borrado");
		}
	}
}
