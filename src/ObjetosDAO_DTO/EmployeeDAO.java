/*
 * Con esta clase accederemos a la BBDD y convertimos una fila de la base de datos en un objeto de Java
 */
package ObjetosDAO_DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class EmployeeDAO {

	private static void liberarRecursos (Statement st, ResultSet rs)
	{
		
		if (rs != null) 	{ try { rs.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		
	}
	
	
	private static void liberarRecursos (Statement st, ResultSet rs, Connection conn)
	{
		
		if (rs != null) 	{ try { rs.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (st != null)	{ try {	st.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	  	
		
	}
	
	private static void liberarRecursos (Connection conn)
	{
		
		if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
	  	
		
	}
	
	
	public List<EmployeeDTO> consultaAllEmpleados () throws SQLException
	{
		List<EmployeeDTO>  employeesList = null;
		employeesList = new ArrayList<EmployeeDTO>();
		
		/* 
		 * TODO
		 * Conectarme a BD
		 * Consultar
		 * Crear objeto EmployeeDTO para cada recurso
		 * add ese dato a la lista
		 * liberar recursos
		 */
		
		Statement st = null;
		ResultSet rs = null;
		Connection conn = null;
		Savepoint savp = null;
	
		try{
		
			DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
			conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
		try{
			
			st = conn.createStatement();
			rs = st.executeQuery(Consultas.CONSULTA_EMPLEADOS_DEPT_ID);
			String nombre = null;
			Integer salario = 0;
			System.out.println("----------------------");
			System.out.println("INICIO DE MOSTRAR");
			System.out.println("----------------------");
			
			
			while (rs.next())
			    {
					nombre = rs.getString(1);
					salario = rs.getInt(2);
					System.out.println("Nombre = "+nombre + " || Salario = " +salario);
				 }
			System.out.println("----------------------");
			System.out.println("FIN DE MOSTRAR");
			System.out.println("----------------------");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			liberarRecursos(st, rs);
			
		}
		return employeesList;
			
	}
		finally
		{
			
		}
	
}
}
