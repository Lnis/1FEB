import java.util.Scanner;


public class PalabrasYLetras {

	
	public static void Contenida (char letra, String palabra)
	{
		int longitud=palabra.length();
		int cantidad=0;
		for(int i=0; i<longitud;i++){
			if(letra==palabra.charAt(i)){
				cantidad++;
			}
		}
		System.out.println("La letra "+letra+" está "+cantidad+" veces en la palabra "+palabra);
	}
	
	public static void main(String args[]) {
		char caracter='a';
		String word;
		Scanner scanner = null;
		
		System.out.println("Dime palabra");
		scanner = new Scanner(System.in);
		word = scanner.nextLine();
		Contenida(caracter,word);
	}
}
