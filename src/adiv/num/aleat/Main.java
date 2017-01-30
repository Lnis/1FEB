/*
 * Construir un programa que simule el juego de la adivinanza de un numero, el programa debe generar un numero aleatorio 
entre 1...100, tiene 5 oportunidades para adivinarlo.
Despues de cada intento el programa debe indicar al usuario si el numero introducido por el usuario es menor, 
mayor o igual al numero a adivinar.
Para generar el vapor aleatorio puede utilizarse la siguiente sentencia:
	int x=(int)(100*Math.random()+1)
 */

package adiv.num.aleat;

public class Main {

	public static void main(String[] args) {
		
		int numero_random=NumeroAleatorio.nRandom();
		int veces=5;
		boolean comparacion=false;
		
		while(veces>0 && !comparacion)			//!comparacion ->es igual que decir comparacion ==false
		{
			int num_leido=Numero.obtenerNumero(veces);
			comparacion=Numero.comparaNumero(numero_random,num_leido);
			veces--;
			if(comparacion){
				System.out.println("Has acertado");
			}
			else
			{
				System.out.println("Has fallado, te quedan "+veces+" intentos");
				Numero.comparacion(numero_random, num_leido);
			}
			
		}
		System.out.println("El número era :"+numero_random);
	}

}
