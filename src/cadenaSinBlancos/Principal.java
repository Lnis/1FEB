package cadenaSinBlancos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner keys = null;
		
		System.out.println("Introduce frase para quitar espacios: ");
		keys = new Scanner(System.in);
		CadenaCaracteres frase=new CadenaCaracteres(keys.nextLine());
		System.out.println(frase.quitaBlancos());
	}
}
