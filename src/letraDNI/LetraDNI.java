package letraDNI;

import java.util.Scanner;

public class LetraDNI {

	public static String caracteresDNI="TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void main(String[] args) {
		Scanner num = null;
		int dni=0;
		
		System.out.println("Dime el numero de tu DNI y te diré la letra");
		num = new Scanner(System.in);
		dni=num.nextInt();

		System.out.println(tomaLetra(dni));
	}
	public static char tomaLetra(int numero){
		numero = numero % 23;
		char letra=caracteresDNI.charAt(numero);
		return letra;
	}
	
}