package arrayDeObjetos;

public class Persona {
	
	private int edad;				//Definimos los atributos de la clase
	private String nombre;

	
	public Persona()
	{
		//constructor por defecto
	}
	
	
	
	/*
	 * Constructor usando parametros
	 */
	
	public Persona (String nombre, int edad)
	{
		this.nombre=nombre;
		this.edad=edad;
	}


	/*
	 * M�todo que devuelve el argumento nombre del objeto Persona sobre el que hacemos la llamada 
	 * a la funci�n
	 */
	public String getNombre() {
		
		return nombre;
	}

	
	/*
	 * M�todo que devuelve el argumento edad del objeto Persona sobre el que hacemos la llamada 
	 * a la funci�n
	 */
	public int getEdad() {
		
		return edad;
	}
	
	
	/*
	 * M�todo que nos busca, entre las personas del array que le enviamos, todas las coinidencias 
	 * con el nombre de la persona sobre la que hacemos la llamada a la funci�n.
	 * Mostrar� por pantalla todas las edades de las personas que coincidan en nombre con el introducido por teclado en main
	 * Tambi�n mostrar� el n�mero de coinidencias que existen. 
	 */
	public void BuscaPersona(Persona [] aper, int n_p) {

		int coinc=0;
		
		for (int i = 0; i < n_p; i++)
			if(nombre.compareTo(aper[i].nombre)==0){
			System.out.println("Edad = " + aper[i].edad);
			coinc++;
		}
		if(coinc==0) {
		System.out.println("NO COINCIDENCIA");
		}
		if(coinc>0) {
			System.out.println("Hay " +coinc+ " coincidencia(s)");
		}
}
	
	
	/*
	 * M�todo que borra del array las personas que coincidan en nombre con el introducido por teclado
	 * en main
	 * Tambien mover� el resto de personas en el array para quitar los posibles huecos vacios que
	 * hayan quedado en el array tras borrar personas
	 * Por �ltimo devuelve el n�mero de personas que se han borrado
	 */
	public int BorrarPersona(Persona [] aper, int n_p) {
		Persona p_aux=null;
		int personas=0;
		for (int i = 0; i < n_p; i++)
		{
			if(nombre.compareTo(aper[i].nombre)==0){
				aper[i]=null;
				personas++;
			}
		}
		for(int k=0; k<aper.length; k++){	
			for (int j=0; j< aper.length-1; j++)
			{
				if(aper[j]==null){
					p_aux=aper[j];
					aper[j]=aper[j+1];
					aper[j+1]=p_aux;
				}
			}
		}
		System.out.println("Se han borrado "+personas+" personas");
		return personas;
	}
	
	
	/*
	 * M�todo que ordena, mediante el m�todo de la  burbuja, las personas seg�n su edad de menor a mayor
	 */
	public static void OrdenarMenAMay(Persona [] aper, int n_p){
		Persona aux;
	 	for(int i=0;i<n_p-1;i++){
		    for(int j=0;j<n_p-i-1;j++){
		         if(aper[j+1].edad<aper[j].edad){
		            aux=aper[j+1];
		            aper[j+1]=aper[j];
		            aper[j]=aux;
		         	}
		         }
	 	}
	}
	
	
	/*
	 * M�todo que devuelve la posici�n en la que debe ser introducida la nueva persona en el array
	 */
	public int obtenerPos (Persona [] aper, int n_p)
	{
		int pos = 0;
	
		while((pos<n_p) && (aper[pos].edad < edad)){
			pos++;
			}
		return pos;
	}
	
	
	/*
	 * M�todo que mueve las personas en el array desde la posici�n que se obtiene del m�todo anterior
	 * hasta la ultima persona que haya en el array
	 */
	public void correrPos (Persona [] aper, int pos, int n_p)	
	{

		for(int i=n_p;i>pos;i--){
			aper[i]=aper[i-1];
		}
	}
	
	public int PosicionPersona(Persona [] aper, int n_p) {

		boolean coinc=false;
		int pos=-5;
		int i=0;
		
		while (i<n_p && !coinc){
			if(nombre.compareTo(aper[i].nombre)==0){
			pos=i+1;
			coinc=true;
		}
			i++;
		}
		
		if(!coinc) {
		System.out.println("NO COINCIDENCIA");
		}
		return pos;
}
}