package edu.femxa.herencia;

public class MainHerencia {

	public static void main(String[] args) {

		Alumno alumno = new Alumno();
		Alumno alumno2 =new Alumno();
		
		alumno.setNombre("Platano");
		alumno.setEdad(6);

		alumno.mostarPersona();
		alumno.setNota(5);
		System.out.println("HASHCODE: "+alumno.hashCode());
		System.out.println("TOSTRING: "+alumno.toString());
		
		alumno2.setNombre("Aroa");
		alumno2.setNota(4);	
		alumno2.setEdad(38);
		
		alumno2=alumno;		//Apuntan a la misma dirección
//		if(alumno==alumno2)	//Con esta sale NO iguales, pero si pongo alumno2=alumno, nos saldría iguales
		if (alumno.equals(alumno2))		//Compara direcciones de memoria, sino ponemos alumno2=alumno, tambien nos saldría NO iguales
		{
			System.out.println("Alumno y Alumno2 son iguales");
		}
		else{
			System.out.println("Alumno y Alumno2 NO son iguales");
		}
		
	 	if (alumno instanceof Persona)
		{
			System.out.println("El alumno es instancia de la clase PERSONA");
		}
		
		if (alumno instanceof Alumno)
		{
			System.out.println("El alumno es instancia de la clase ALUMNO");
		}
		
		if (alumno instanceof Object)
		{
			System.out.println("El alumno es instancia de la clase OBJETO");
		}
	}

}
