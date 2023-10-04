package Day2;

public class Emp {
private int empid;
private String ename;
private double salary;

Emp()

{ 
	System.out.println("default constructor is called");
	this.empid=10;
this.ename="Ayesha";
this.salary=30000;
	
	
	}
Emp(int empid,String ename,double salary)
{
	System.out.println("parameterized constructor is called");
	
	this.empid=empid;
	this.ename=ename;
	this.salary=salary;
		
	
	}
public String getname()
{ 
	return ename;
	}
public int getsal()
{ 
	return (int)salary;
	}

public void setname(String name)
{this.ename=name;
	}
public int setsal(int sal)
{this.salary=sal;
return sal;
	}

public String toString()
{
	return "emp details  "+this.empid+" "+this.ename+"  "+this.salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		Emp e1=new Emp(101,"shaikh",10000);
		System.out.println(e1);
		System.out.println(e);
		//System.out.println(e1);
		

	}
	

}
