package JDBCConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCoprations {
private static Connection conn;

private String username;
private String password;
private String query;
public JDBCoprations() {
	// TODO Auto-generated constructor stub
	username="";
	password="";
	query="";
	conn=null;
}
public static Connection mmysqlconnection(String username, String password) throws SQLException {

	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/assigment2", username, password);
	return conn;
	}
public JDBCoprations(String username ,String password) throws SQLException {
	// TODO Auto-generated constructor stub
	System.out.println("par constructor");
	username="root";
	password="root";
	query="";
	conn=JDBCoprations.mmysqlconnection(username, password);
	System.out.println(this.conn);
}
public void createdatabase(String name) throws SQLException
{
	Statement stmt=conn.createStatement();
	String query="create database " + name; //create database is  sql query 
	stmt.executeUpdate(query);
	System.out.println("databse created");
	}


public void  createtable(String query) throws SQLException
{
	Statement stmt=conn.createStatement();
	System.out.println(stmt.executeUpdate(query));
	System.out.println("table is created");
	}
public void insertdataintable() throws SQLException, NumberFormatException, IOException
{
	Statement stmt=conn.createStatement();
//	

	 PreparedStatement pst = conn.prepareStatement("insert into emp values(?,?,?)");


	                     // taking values from keyboard
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter Employee ID:");
	int id = Integer.parseInt(br.readLine( ) );

	System.out.println("Enter Employee Name:");
	String name = br.readLine( );

	System.out.println("Enter Employee Salary:");
	double salary = Double.parseDouble(br.readLine( ) );

	//The values are stored in local varables, id, name and salary

	pst.setInt(1, id);
	pst.setString(2, name);
	pst.setDouble(3, salary);

	pst.executeUpdate( );

	System.out.println(name + " Record is inserted");

	}
public void deleterecord() throws SQLException
{Statement stmt=conn.createStatement();

	stmt.executeUpdate("delete from emp where empid=1;");
	}
public void showrecords() throws SQLException
{
	Statement stmt=conn.createStatement();

	ResultSet ss=stmt.executeQuery("select * from emp;");
	while(ss.next())
	{
		System.out.println(ss.getInt(1)+" "+ss.getString(2)+" "+ss.getString(3));
	
	
	}
	}
public void closeconn() throws SQLException
{
	if(conn!=null)
	{
		conn.close();
		System.out.println("con is closed");
	}
	else
	{
		System.out.println("conn is null");
	}
	}

}
