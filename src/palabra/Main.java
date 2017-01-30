package palabra;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word=null;
		Scanner scanner1 = null;
		Scanner scanner2 = null;
		Scanner scanner3 = null;
		int num=0;
		int veces=0;
		char letra='a';
		int n;
		
		System.out.println("Dime palabra");
		scanner1 = new Scanner(System.in);
		word = scanner1.nextLine();
		
	//	System.out.println("Dime posicion");
	//	scanner2 = new Scanner(System.in);
	//	num = scanner2.nextInt();
		
		System.out.println("Dime cantidad");
		scanner3 = new Scanner(System.in);
		n = scanner3.nextInt();
		
	//	LetrasPalabra.Imprimir(word);
	//	CadenaFor.ImprimirFor(word);
	//	NPrimerasLetras.RecorrerPrimeras(word, num);
	//	NUltimasLetras.RecorrerUltimas(word, num);
	//	veces=VecesLetra.Contenida(word,letra);
	//	System.out.println("La letra "+letra+" está "+veces+" veces en la palabra "+word);
	//	AlReves.Invertir(word);
		NLetrasAlReves.muestraRevesN(word, n);
		System.out.println("FIN");
	}

}
