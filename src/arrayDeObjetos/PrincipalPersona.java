package arrayDeObjetos;

import java.util.Scanner;

public class PrincipalPersona {

	public static final int NUM_PERSONAS=5;
	public static void main(String[] args) {
		Persona array_persona[] = null;
		Persona persona_aux = null;
		String nombre_aux,nombre= null;
		int edad_aux,edad=0;
		int opcion=0;
		Scanner scaner = null;
		Scanner scanner = null;
		int n_personas = 1;	//Contador creado para conocer el número de personas que tenemos en el array, está inicializado a 1 porque el array lo creamos con una persona por defecto
		
		
		array_persona = new Persona [NUM_PERSONAS];
		
		Persona persona1 = new Persona("Alex", 27);		//Creamos la base de datos con una persona por defecto
		array_persona[0] = persona1;
		
		System.out.println("Bienvenido a la Base de Datos de Personal");
/*
 * Creación de Menú donde el usuario tiene que elegir la opción que desee mediante la introduccion
 * de un número.
 * Cuando el número introducido es 5, salimos del programa
 */
		while (opcion!=5){
			
			System.out.println("Elige la opción que desees para continuar");
			System.out.print(" 1. INSERTAR PERSONA \n 2. LISTAR PERSONAS \n 3. BUSCAR PERSONA POR NOMBRE \n 4. BORRAR PERSONA \n 5. SALIR \n 6. ORDENAR POR EDAD \n 7. INSERTAR ORDENADO (SE RECOMIENDA EJECUTAR PRIMERO EL PASO 6) \n 8. BUSCAR POSICION DE LA PERSONA POR NOMBRE \n");
			scaner = new Scanner(System.in);
			try{
				opcion = scaner.nextInt();
				}
				catch (java.util.InputMismatchException e) //error con otros caracteres
				{
				opcion = 0;
				scanner = new Scanner(System.in);
				System.out.println("Error: valor no válido");
				}
			
		
			
			switch (opcion) {
			case 1: 
				/*
				 * Nos permite introdir datos de nuevas personas hasta el límite que querramos poner,
				 * en nuestro caso el límite es de 5 personas.
				 */
				if (n_personas>=NUM_PERSONAS){
					System.out.println("Número máximo de personas alcanzado");
					break;
				}
				
				System.out.println("Has elegido insertar una persona nueva");
				System.out.println("Introduce nombre:");
				scanner = new Scanner(System.in);
				nombre = scanner.next();
				System.out.println("Introduce edad:");
				scanner = new Scanner(System.in);
				edad = scanner.nextInt();
				array_persona[n_personas] = new Persona(nombre,edad);	//Con los datos introducidos por teclado creamos una Persona y la metemos en el sitio correspondiente en el array.
				n_personas++;			
				break;
				
			case 2: 
				System.out.println("Has elegido mostrar todas las personas");
				for (int i = 0; i < n_personas; i++)
				{
					persona_aux = array_persona[i];
					nombre_aux = persona_aux.getNombre();
					edad_aux = persona_aux.getEdad();
					System.out.println("Nombre = " + nombre_aux);
					System.out.println("Edad = " + edad_aux);
				}
				if(n_personas==0)
					System.out.println("No hay personas en la base de datos");	//Para comprobar que se ejecuta aunque no haya datos en el array
				else
					System.out.println("Hay "+n_personas+" persona(s) en la base de datos");
				break;
				
			case 3: 
				
				System.out.println("Has elegido buscar a una persona");
				System.out.println("Introduce el nombre de la persona de la que quieres buscar datos");
				scanner = new Scanner(System.in);
				nombre = scanner.next();
				persona_aux=new Persona(nombre,0);
				persona_aux.BuscaPersona(array_persona, n_personas);	//Llamamos a la función con el objeto Persona persona_aux
				break;
				
			case 4: 
				System.out.println("Has elegido borrar a una persona");
				System.out.println("Introduce el nombre de la persona de la que quieres borrar datos");
				scanner = new Scanner(System.in);
				nombre = scanner.next();
				persona_aux=new Persona(nombre,0);
				n_personas=n_personas-persona_aux.BorrarPersona(array_persona, n_personas);	//La función nos devuelve el número de personas que se han borrado en el array
				break;
				
			case 5: 
				System.out.println("HASTA LUEGO");
				break;
				
			case 6:
				System.out.println("Has elegido ordenar las personas por edad");
				Persona.OrdenarMenAMay(array_persona, n_personas);	//Llamamos a la función static porque la función siempre hace lo mismo independientemente del objeto sobre el que se llame
				break;
				
			case 7:
				/*
				 * Al igual que en el case 1, si alcanzamos el numero máximo de personas no se pueden añadir más
				 */
				if (n_personas>=NUM_PERSONAS){
					System.out.println("Número máximo de personas alcanzado");
					break;
				}
				System.out.println("Has elegido introducir el siguiente dato de manera ordenada por edad");
				System.out.println("Introduce nombre:");
				scanner = new Scanner(System.in);
				nombre = scanner.next();
				System.out.println("Introduce edad:");
				scanner = new Scanner(System.in);
				edad = scanner.nextInt();
				
				persona_aux=new Persona(nombre,edad);
				int posi=persona_aux.obtenerPos(array_persona, n_personas);	//Obternemos la posición en la que debe ir la persona que queremos añadir
				persona_aux.correrPos(array_persona, posi, n_personas);		//Movemos el resto de personas para hacer sitio a la nueva que tenemos que introducir
				
				array_persona[posi] = persona_aux;	//Introdicimos la nueva persona en la posición que obtuvimos previamente
				
				n_personas++;
				break;
				
			case 8:
				System.out.println("Has elegido buscar la posicion de una persona");
				System.out.println("Introduce el nombre de la persona de la que quieres buscar datos");
				scanner = new Scanner(System.in);
				nombre = scanner.next();
				persona_aux=new Persona(nombre,0);
				System.out.println("La persona está en posicion: " +persona_aux.PosicionPersona(array_persona, n_personas));
				break;
				
			default:
				System.out.println("OPCION NO VÁLIDA");
				break;
			}
		
		}
			
	}
}

