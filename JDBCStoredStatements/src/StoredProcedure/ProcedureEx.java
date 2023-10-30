package StoredProcedure;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.CallableStatement;

public class ProcedureEx {
public static void main(String[] args) {
	Connection con=null;
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assigment2", "root","root");
		CallableStatement cs=con.prepareCall("{call updateEmpSalary(?,?,?)}");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
