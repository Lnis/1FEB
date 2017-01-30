package adiv.num.aleat;

import java.util.Scanner;

public class Numero {
	
	public static int obtenerNumero(int intentos)
	{
		int numero_leido = 0;
		Scanner scaner = null;
		
		System.out.println("Adivina el número que estoy pensando entre 1 y 100 (tienes: "+intentos+" intentos)");
		scaner = new Scanner(System.in);
		numero_leido = scaner.nextInt();

		return numero_leido;
	}

	public static boolean comparaNumero(int n_pensado, int n_leido)
	{
		boolean correcto=false;
		
		if(n_pensado==n_leido)
		{
			correcto=true;
		}
		return correcto;
	}
	
	public static void comparacion (int n_pensado, int n_leido)
	{
		if(n_pensado>n_leido){
			System.out.println("El numero es mayor");
		}
		else{
			System.out.println("El numero es menor");
		}
		}
}
