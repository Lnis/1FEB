package ordenacion;

public class InsertarOrdenado {
	
	
	public static int obtenerPos (int [] ae, int n)
	{
		/*
		 * Método que nos dice la posicion que ocuparía un numero en un array si los queremos ordenar de menor a mayor
		 */
		
		int pos = 0;
		
		while(ae[pos]<n && pos<ae.length){
			pos++;
			}
		return pos;
	}
	
	public static void correrPos (int [] ae, int pos, int num)	//No devuelve nada porque lo que toquemos en el array se ve fuera
	{
		/*
		 * Nos mueve los numeros de un array una posición hacia la derecha desde la posicion que le indicamos
		 */
		for(int i=ae.length-1;i>pos;i--){
			ae[i]=ae[i-1];
		}
		ae[pos]=num;
			
		}
		
	public static void main(String[] args) {
		int ae[] = new int [5];
		
		ae[0] = 1;
		ae[1] = 2;
		ae[2] = 5;
		ae[3] = 6;
		ae[4] = 7;
		
		int n_usuario = 3;
		
		int pos = obtenerPos(ae, n_usuario);
		correrPos(ae, pos, n_usuario);
		
		System.out.println("El numero " + n_usuario + " debe ir en " + pos);
		
		for (int j=0;j<ae.length;j++)
		{
			System.out.println(ae[j]);
		}
	}

}
