package cadenaSinBlancos;

public class CadenaCaracteres {
	
	String cadenaCaracteres;
	
	public CadenaCaracteres(String cadena){
		cadenaCaracteres=cadena;
	}
	

/**
 * La funcion es llamada sobre el objeto que ya contiene el String que queremos sin espacios	
 * @return un String que contiene la frase sin espacios
 */
	public String quitaBlancos() 
	{
	String cadenaSinBlancos = "";
//	String cadenaSinBlancos = new String();
	int y=cadenaCaracteres.length();
	String cadena=cadenaCaracteres;
		for (int x=0; x< cadenaCaracteres.length(); x++)
		{
			if (cadenaCaracteres.charAt(x) != ' ')
			{
				cadenaSinBlancos += cadenaCaracteres.charAt(x); 
			}
		}
		return cadenaSinBlancos;
	} 
}
