package Day2;

public class SalesEmployee extends Employee implements stack
{
	SalesEmployee[]  stck;

	int top=-1;
	private int sales;
	private double commission;
	private double netSalary;
	
	public SalesEmployee() {
		System.out.println("Default constructor of SalesEmployee is called");
		this.sales=0;
		this.commission=0;
		this.netSalary=0;
	}

	public SalesEmployee(int empId,String empName,double salary,int sales) {
		super(empId,empName,salary);
		System.out.println("Parameterised constructor of SalesEmployee is called");
		this.sales = sales;
		this.commission = 0;
		this.netSalary = 0;
		stck=new SalesEmployee[0];
		top=0;
	}
	
	public String toString() {
		return super.toString()+ "Sales "+this.sales+" Commission "+this.commission+" Net Salary"+this.netSalary;
	}
	public void Calculate()
	{
		if(sales<5000)
		{
			commission=super.getSalary()*0.5;
			System.out.println(commission);
		}
		else if(sales>=5000 & sales<10000)
		{
			commission=super.getSalary()*0.5;
			System.out.println(commission);
		
		}
		else if(sales >=10000 & sales<15000)
		{
			commission=super.getSalary()*0.7;
			System.out.println(commission);
		
		}
		
	}
	
	public static void main(String[] args) {
		SalesEmployee s=new SalesEmployee();
	//	SalesEmployee s1=new SalesEmployee(7, "ayesha",50, 20000);
		s.Calculate();
		

	}
	
	
	 SalesEmployee(int size)
	{
		stck=new SalesEmployee[size];
		top=-1;
	}
	@Override
	public void push(SalesEmployee obj) {
		
		// TODO Auto-generated method stub
		//stck=new int[10];
		if(top==stck.length-1)
		{
			System.out.println("stack is full");
		}
		else
		{
			stck[++top]=obj;
			System.out.println(obj);
		}
		
	}

	@Override
	public SalesEmployee pop() {
		// TODO Auto-generated method stub
		if(top<0)
		{
			System.out.println("empty stack");
			return null;
		}
		else
		{
			return stck[top--];
		}
	}
	
}




