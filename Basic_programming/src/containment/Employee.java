package containment;

public class Employee {

	private int empid;
	public Employee()
	{
		this.empid=0;
	}
	public Employee(int id)
	{
		this.empid=id;
	}
	public String toString()
	{
		return "empid"+empid;
		
	}
}