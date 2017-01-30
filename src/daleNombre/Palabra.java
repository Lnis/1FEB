package daleNombre;

/**
 * 
 * 
 * @author Val
 *
 *El código de esta clase, es un poco misterioso. Algún programador Clase "C", no ha usado
 *nombres descriptivos y ahora, nos toca pegarnos y descubrir qué narices hace este código, 
 *para poder usarlo en nuestro proyecto.
 *
 *
 *Se pide:
 *
 *1) Adivinar la funcionalidad del método adivinaQueHace -> Adivina si una palabra es palindroma
 *2) Una vez descubierto, aplicar un nombre apropiado al método y a la clase
 *3) Idear un método equivalente, pero distinto. Es decir, crear un método 
 *que haga lo mismo que adivinaQueHace, pero de otra manera.
 *4) EXTRA: Sólo si resolviste los puntos anteriores, implementa una versión recursiva
 *
 */
public class Palabra {
	
	private static boolean esPolindroma (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
	
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
//		if (esPolindroma("poop"))
		if (esPolindromo("poop"))
		{
			System.out.println("VERDADERO");
		} else 
		{
			System.out.println("FALSO");
		}
	}

}