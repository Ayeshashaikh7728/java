package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/assigment2";
		String password="root";
		String username="root";
		Connection con=null;
		
		try {
			//System.out.println(con);
			con=DriverManager.getConnection(url,username,password);
			System.out.println(con);
			if(con!=null)
			{
				System.out.println("connection sucessfull_______________");
			}
			else
			{

				System.out.println("connection not  sucessfull_______________");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e.getMessage());
		}
	
	finally
	{
		if(con!=null)
		{
			
			con.close();
			System.out.println("Closing Connection......");
		}else {
			System.out.println("Cant able to close the connection.....");
		}
		}
	}}


