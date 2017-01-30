package edu.femxa.herencia;

public class Alumno extends Persona
{
	/*@Override		//sale solo al poner mostrarPersona(), significa que vamos a sobreescribir el metodo de Persona en Alumno
	public void mostarPersona() {
		// TODO Auto-generated method stub
		super.mostarPersona();		//si comento esta linea no me ejecutaría el metodo mostrarPersona de Persona, solo al de Alumno
		System.out.println("Ha llamado al metodo mostrar de Alumno");
	}
*/
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	private int nota;
	@Override
	public String toString() {
		String str_dev=null;
		
		return str_dev;
		
		//return super.toString();	//si descomentamos esta linea y comentamos el override, vuelve a utilizar el metodo de la clase de la que hereda
	}

	@Override
	public boolean equals(Object obj) {
		boolean var=false;
		Alumno alumno2=null;
		
		alumno2=(Alumno)obj;
	//	if(this.getNombre().equals(alumno2.getNombre()) && this.getEdad().equals(alumno2.getEdad()) && this.getNota().equals(alumno2.getNota()))
				{
					var=true;
				}
			
		return var;
	}
}
