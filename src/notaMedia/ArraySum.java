package notaMedia;

public class ArraySum {
	
	private int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
	
	public static void main(String[] args) {
		ArraySum a = new ArraySum();
	    int[] nota = a.getVariable();
		float media = sumaNota(nota);

		media=media/nota.length;
		System.out.println("La media es "+media);
	/**
	 * Suma los int de un array		
	 */
	}
	public static float sumaNota (int an[]){
	float suma=0;
	
	for (int i=1; i<=an.length;i++){
		suma=suma+an[i-1];
	}
	return suma;
	
}
	/**
	 * Para acceder a los int del array private
	 * @return el array cuyos valores solo son accesibles mediante obtejo de la clase
	 */
	public int[] getVariable() 
	{ 
		return array_notas; 
	}
}
