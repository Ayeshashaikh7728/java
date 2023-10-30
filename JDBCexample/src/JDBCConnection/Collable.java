package JDBCConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Collable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 	Connection con=null;
	        try
	        {
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assigment2","root","root");
//	            CallableStatement cs=con.prepareCall("{call updateEmpSalary(?,?)}");
//	            cs.setInt(1,2); // setting id
//	            cs.setInt(2,10); //increment
//	            cs.executeUpdate();
//	            System.out.println("Salary Updated successfully....");
	            
	            
	            
	            
//	            CallableStatement cs=con.prepareCall("{call incCounter(?)}");
//	            cs.registerOutParameter(1, Types.INTEGER);
//	            cs.setInt(1,3);//provoiding counter as 3
//	            cs.execute();
//	            System.out.println("counter :  "+cs.getInt(1));
	            
	            
	            
	            
//	            CallableStatement cs=con.prepareCall("{call countEmp(?)}");
//	            cs.registerOutParameter(1,Types.INTEGER);
//	            cs.execute();
//	            System.out.println("Number of emp : "+cs.getInt(1));
//	            
	            CallableStatement cs = con.prepareCall("{call changeSalary(?, ?, ?, ?)}");

				cs.setInt(1, 102); //first  question mark for empid (1)

				cs.setDouble(2, 20); //second question mark for increment (1)

				cs.registerOutParameter(3, Types.INTEGER); // Old Salary // 3rd for output salary

				cs.registerOutParameter(4, Types.INTEGER); // New Salary //4th for output newsalary

				cs.execute();

	 

				System.out.println("Old Salary: " + cs.getInt(3));

				System.out.println("New Salary: " + cs.getInt(4));

	
	            
	            
	        }
	        catch(Exception e) {
	        	System.out.println(e.getMessage());
	        }
		

	}

}
