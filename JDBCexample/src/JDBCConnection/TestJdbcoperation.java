package JDBCConnection;

import java.sql.SQLException;

public class TestJdbcoperation {
	public static void main(String[] args) throws SQLException {
		try {
			JDBCoprations jb=new JDBCoprations("shital2","shital@123");
			//jb.createtable("create table emp(empid int ,empname varchar(30),salary int )");
			//jb.createtable("insert into emp values(1,'zzzzz',1000000)");
	//	jb.insertdataintable();
		//	jb.createdatabase("newdatabasecreate");
			//jb.deleterecord();
			jb.showrecords();
			jb.closeconn();	

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
