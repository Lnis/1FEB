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
	 * Método que devuelve el argumento nombre del objeto Persona sobre el que hacemos la llamada 
	 * a la función
	 */
	public String getNombre() {
		
		return nombre;
	}

	
	/*
	 * Método que devuelve el argumento edad del objeto Persona sobre el que hacemos la llamada 
	 * a la función
	 */
	public int getEdad() {
		
		return edad;
	}
	
	
	/*
	 * Método que nos busca, entre las personas del array que le enviamos, todas las coinidencias 
	 * con el nombre de la persona sobre la que hacemos la llamada a la función.
	 * Mostrará por pantalla todas las edades de las personas que coincidan en nombre con el introducido por teclado en main
	 * También mostrará el número de coinidencias que existen. 
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
	 * Método que borra del array las personas que coincidan en nombre con el introducido por teclado
	 * en main
	 * Tambien moverá el resto de personas en el array para quitar los posibles huecos vacios que
	 * hayan quedado en el array tras borrar personas
	 * Por último devuelve el número de personas que se han borrado
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
	 * Método que ordena, mediante el método de la  burbuja, las personas según su edad de menor a mayor
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
	 * Método que devuelve la posición en la que debe ser introducida la nueva persona en el array
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
	 * Método que mueve las personas en el array desde la posición que se obtiene del método anterior
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