package ordenacion;

public class OrdenarArray {

	public static void main(String[] args)
	{
		int a_ent_a [] = new int[4];
		int posi=0;
		int num=0;

		
/*		//inicializo el array con numeros aleatorios
		for(int i=0;i<a_ent_a.length;i++)
		{
			a_ent_a[i]=Numero.nRandom();
			System.out.println(a_ent_a[i]);
		}*/
		
		System.out.println("Dame 4 numeros:");
		
		a_ent_a[0]=Numero.pedirNumeroUsuario();
		for(int i=0;i<a_ent_a.length-1;i++)
		{
			num=Numero.pedirNumeroUsuario();
			posi=Numero.obtenerPos(a_ent_a, num);
			Numero.correrPos(a_ent_a, posi, num);
		}
			
				
	//	Numero.ordenoArray(a_ent_a);
		for (int j=0;j<a_ent_a.length;j++)
		{
			System.out.println(a_ent_a[j]);
		}
	}

}
