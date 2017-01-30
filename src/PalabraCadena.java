import java.util.Scanner;


public class PalabraCadena {

	public static boolean SiLetraEnCadena(String palabra, char letra)
	{
		boolean b_dev=false;
		int longitud=palabra.length();
		int i=0;
		do{
			if(letra==palabra.charAt(i)){
				b_dev=true;
			}
			i++;
		}while (i<longitud && b_dev==false);
		return b_dev;
	}
	
	public static void main(String args[]) {
		char caracter='a';
		String word;
		Scanner scanner = null;
		
		System.out.println("Dime palabra");
		scanner = new Scanner(System.in);
		word = scanner.nextLine();
		if(SiLetraEnCadena(word,caracter)){
			System.out.println("La letra está en la palabra");
		}
		else System.out.println("No está");
		
	}
	
}
