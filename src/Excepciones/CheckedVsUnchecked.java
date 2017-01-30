package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		String cadena = null;
		int ae[]=new int [4];
//		try{
			int longi=ae.length;
			ae[ae.length]=3;
			File f= new File ("fulanito");
			if (f.exists())
			{
				System.out.println("Existe");
				try{
					FileReader fr = new FileReader(f);
				}catch (FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println(longi);
//		int tamanio = cadena.length();
//		System.out.println(tamanio);

/*	}catch (Exception e){
		System.out.println("EXCEPCION PRODUCIDA");
		e.printStackTrace();
	}*/

}
}
