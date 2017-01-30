package palabra;

import java.util.Scanner;

public class Palindroma {
	
	public static String Invertir(String palabra)
	{
		if ((null == palabra) || (palabra.length() <= 1)) {
			return palabra;
			}
		return new StringBuffer(palabra).reverse().toString();
			}

	public static boolean Compara(String palabra1, String palabra2){
		boolean condicion=false;
		if (palabra1.equals(palabra2)){
			condicion=true;
		}
		return condicion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra, palabraInv=null;
		Scanner scaner = null;
		
		System.out.println("Escribe la palabra que quieras saber si el palíndroma:");
		scaner = new Scanner(System.in);
		palabra = scaner.next();
		palabraInv=Invertir(palabra);
		System.out.println(palabraInv);
		
		if(Compara(palabra, palabraInv)){
			System.out.println(palabra+ " es polindroma");
		}
		else{
			System.out.println(palabra+ " no es polindroma");
		}
}
}
