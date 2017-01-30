package edu.femxa.val.basededatos.dao;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propiedades 
{
	public static void main (String[] args) throws IOException
	{
		Properties fichero_propiedades = null;
		fichero_propiedades=new Properties();
		FileReader fr = new FileReader("db.properties");
		fichero_propiedades.load(fr);
		String vd = fichero_propiedades.getProperty("driver"); //me lee lo que hay dentro de properties en la fila que he llamado driver=
		String cadena_conexion = fichero_propiedades.getProperty("cadena_conexion");
		String usuario = fichero_propiedades.getProperty("user");
		String contraseña = fichero_propiedades.getProperty("password");
		System.out.println(vd);
		System.out.println(cadena_conexion);
		System.out.println(usuario);
		System.out.println(contraseña);
		fichero_propiedades.setProperty(contraseña,"1234");
		System.out.println(vd);
		System.out.println(contraseña+"  "+usuario);
		fr.close();
	}

}
