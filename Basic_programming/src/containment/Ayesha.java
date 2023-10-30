package containment;

public class Ayesha {
	private int id;
	Employee e;
	//private Employee emp;
	public Ayesha(int id,int emp) {
	
		this.id=id;
e=new Employee(emp);
	}
public String toString()
{
	return e.toString()+"Ayesha id:"+id;
	}
}
