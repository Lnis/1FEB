package ordenacion;

import java.util.Scanner;

public class Numero {

	public static int nRandom()
	{
		int x=(int)(100*Math.random()+1);
		return x;
	}
	
	public static int pedirNumeroUsuario ()
	{
		int numero_usuario = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in);
			numero_usuario = scanner.nextInt();
		
		return numero_usuario;
	}
	
	public static void correrPos (int [] ae, int pos, int num)	
	{
		
		for(int i=ae.length-1;i>pos;i--){
			ae[i]=ae[i-1];
		}
		ae[pos]=num;
			
		}
	
	public static void ordenoArray(int [] array)
	{
        int i, j, aux;
        for(i=0;i<array.length-1;i++)
             for(j=0;j<array.length-i-1;j++)
                  if(array[j+1]<array[j]){
                     aux=array[j+1];
                     array[j+1]=array[j];
                     array[j]=aux;
                  }
}
	public static int obtenerPos (int [] ae, int n)
	{
		int pos = 0;
		
		while(ae[pos]<n && pos<ae.length){
			pos++;
			}
		return pos;
	}
	
}

