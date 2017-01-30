package palabra;

import java.util.Scanner;

public class Polindro {

	public static boolean esPolindromo(String palabra)
	{
		boolean condicion=true;
		int inicio=0;
		int fin=palabra.length()-1;
		while(condicion && inicio<=fin){
			if(palabra.charAt(inicio)!=palabra.charAt(fin)){
				condicion=false;
			}
			inicio++;
			fin--;
		}
		return condicion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = null;
		Scanner scaner = null;
		
		System.out.println("Escribe la palabra que quieras saber si el palíndroma:");
		scaner = new Scanner(System.in);
		palabra = scaner.next();
		if(esPolindromo(palabra))
		{
			System.out.println(palabra+" es polindroma");
		}
		else{
			System.out.println(palabra+" no es polindroma");
		}
	}

}
