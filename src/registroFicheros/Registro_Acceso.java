package registroFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registro_Acceso {

	public static void main(String[] args) throws IOException {
		
		int opcion=-1;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		
		while (opcion!=0){
		
			try{
				System.out.print("Elige una opción:\n 1. SIGN UP \n 2. SIGN IN\n Press 0 to EXIT\n");
				opcion = scanner.nextInt();
				}
				catch (java.util.InputMismatchException e) //error con otros caracteres
				{
				opcion = 5;
				System.out.println("Error: valor no válido");
				}
			
			switch (opcion) {
			case 1: 
				Registrarse();
				break;
			case 2:
				Acceder();
				break;
			default:
				System.out.println("Opción no válida");
				break;	
			}

		}
	}
	
	public static void Registrarse() throws IOException{
		String user=null;
		String psw=null;
		String psw_c=null;
		Scanner scan = null;
		File file_user = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\USERS"); 
		File file_passw = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\PASSWORDS"); 
		scan = new Scanner(System.in);
		System.out.println("Introduce USUARIO: ");
		user = scan.next();
		if(!Existe(user,file_user)){
			if(CreaUsuario (user, file_user)){
				System.out.println("Introduce CONTRASEÑA: ");
				psw = scan.next();
				System.out.println("Confirma CONTRASEÑA: ");
				psw_c = scan.next();
				if(psw.equals(psw_c)){
					psw=Codifica(psw);
						if(CreaUsuario(psw, file_passw)){
							System.out.println("Usuario creado correctamente");
						}
				}
				else{
					System.out.println("La contraseña NO COINCIDE");
				}
				}
		}
		else{
			System.out.println("Usuario utilizado");
		}
		
	}
	
	public static boolean Existe(String usuario, File f){
		boolean existe=false;
		String yaEs = null;
		FileReader fr=null;
		BufferedReader br = null;
		int i=0;
		try 
		{
			fr=new FileReader (f);
			br = new BufferedReader(fr);
			while (br.ready()){
				yaEs = br.readLine();
				if(yaEs.equals(usuario)){
					existe = true;
					i++;
				}
			}
			
		} 
		catch (FileNotFoundException e) 
			{
			
				System.out.println("Error al crear el Usuario");
				e.printStackTrace();
			}
		catch (IOException io)
			{
				System.out.println("Error al crear el Usuario");
				io.printStackTrace();
			}
		finally 
			{
				try 
					{
						br.close();
						fr.close();
					} 
				catch (Exception e) 
				{
					System.out.println("Error liberando recursos");
					e.printStackTrace();
				}
			}
		return existe;
		}
	
	public static boolean CreaUsuario (String palabra, File file)
	{
		boolean nuevo=false;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try 
		{
		fw=new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.write(palabra);
		bw.newLine();
		nuevo=true;
		} 
		catch (IOException e) {
			System.out.println("Error creando usuario/contraseña");
			e.printStackTrace();
			nuevo = false;
		}
		finally 
		{
			try {
				bw.close();
				fw.close();
			} 
			catch (Exception e) {
				System.out.println("Error cerrando usuario/contraseña");
				e.printStackTrace();
				nuevo = false;
			}
			
		}
		return nuevo;	
	}
	public static String Codifica (String passw)
	{
		char letra=0;
		String codificada="";
		int longi=passw.length();
		for(int i=0; i<longi; i++){
			letra=(char) (passw.charAt(i)-14);
			codificada+=letra;
		}
		
		return codificada;
	}
	public static void Acceder() throws IOException{
		boolean coincide=false;
		boolean existe=true;
		String user=null;
		String psw=null;
		String psw_c=null;
		Scanner scan = null;
		int veces=0;
		File file_user = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\USERS"); 
		File file_passw = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\PASSWORDS"); 
		scan = new Scanner(System.in);
		System.out.println("Introduce USUARIO: ");
		user = scan.next();
		while(veces<3 && !coincide && existe){
			existe= Existe(user,file_user);
			if(existe){
				System.out.println("Introduce CONTRASEÑA: ");
				psw = scan.next();
				
					psw=Codifica(psw);
					coincide = CoincideUsuario(user, psw, file_user, file_passw);
						if(coincide){
							System.out.println("Bienvenido al sistema");
						}
						else{
							System.out.println("Usuario y contraseña no cinciden");
						}
				}
			else{
				System.out.println("El usuario no existe");
			}
			veces++;
		}
		
	}
	public static String[] fromFichero2Array (File file){
		String[] lista_cadena = null;
		FileReader fr = null;
		BufferedReader br = null;
			try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					int nlineas = contarLineas(file);
					lista_cadena = new String[nlineas];
					int pos = 0;
					String linea =br.readLine();
					while (linea!=null)
					{
						lista_cadena[pos] = linea;
						pos = pos + 1;
						linea = br.readLine();
					}
				} 
			catch (FileNotFoundException e) {
					System.out.println("Error al crear el FileReader");
					e.printStackTrace();
				}
			catch (IOException io){
					System.out.println("Error al hacer readLine");
					io.printStackTrace();
				}
			finally {
					try {
							br.close();
							fr.close();
						} 
					catch (Exception e) {
						System.out.println("Error liberando recursos");
						e.printStackTrace();
					}
				}
		return lista_cadena; 
	}
	
	private static int contarLineas (File f) throws IOException
	{
		int nlineas = 0;
		FileReader fr = null;
		BufferedReader br = null;
		String cadaux = null;
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while (br.readLine()!=null){
				nlineas = nlineas + 1;
			}
			br.close();
			fr.close();
		return nlineas;
	}
	
	public static boolean CoincideUsuario(String usuario, String contr, File f_usu, File f_contr) throws IOException{
		boolean existe = false;
		boolean coinc = false;
		String [] usu_f= new String[contarLineas(f_usu)];
		String [] contr_f = new String [contarLineas(f_contr)];
		FileReader fr=null;
		BufferedReader br = null;
		int i=0;
		int j=0;
		try 
		{
			fr=new FileReader (f_usu);
			br = new BufferedReader(fr);
			while (br.ready() && !existe){
				usu_f [i] = br.readLine();
				if(usu_f[i].equals(usuario)){
					existe = true;
				}
				i++;
			}
			fr = new FileReader(f_contr);
			br = new BufferedReader(fr);
			while (br.ready()){
				contr_f [j] = br.readLine();
				j++;
			}
			if(contr.equals(contr_f[i-1])){
				coinc=true;
			}
		} 
		catch (FileNotFoundException e) 
			{
			
				System.out.println("Error al crear el Usuario");
				e.printStackTrace();
			}
		catch (IOException io)
			{
				System.out.println("Error al crear el Usuario");
				io.printStackTrace();
			}
		finally 
			{
				try 
					{
						br.close();
						fr.close();
					} 
				catch (Exception e) 
				{
					System.out.println("Error liberando recursos");
					e.printStackTrace();
				}
			}
		return coinc;
		}
}
