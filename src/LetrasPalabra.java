import java.util.Scanner;


public class LetrasPalabra {
	
	
	public static void Imprimir(String palabra){
		
		int longitud=palabra.length();
		for(int i=0; i<longitud;i++){
			System.out.println(palabra.charAt(i));
		}
	}

	public static void main(String[] args) {
		String word;
		Scanner scanner = null;
		
		System.out.println("Dime palabra");
		scanner = new Scanner(System.in);
		word = scanner.nextLine();
		Imprimir(word);
	}

}
