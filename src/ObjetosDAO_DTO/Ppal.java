package ObjetosDAO_DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.util.List;

public class Ppal {

	public static void main(String[] args) throws Exception {
		
		EmployeeDAO empDAO = new EmployeeDAO();
		
		List<EmployeeDTO> l_e = empDAO.consultaAllEmpleados();
}

}
