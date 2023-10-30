package Day2;


	
	
	public class Employee {
		private int empId;
		private String empName;
		private double salary;
		
		public Employee() {
			System.out.println("Default constructor of Employee is called");
			this.empId=0;
			this.empName="";
			this.salary=0;
		}
		
		public Employee(int empId,String empName,double salary) {
			System.out.println("Parameterised constructor of Employee is called");
			this.empId=empId;
			this.empName=empName;
			this.salary=salary;
		}
		
		public String getEmpName() {
			return empName;
		}
		
		public void setEmpName(String name) {
			this.empName=name;
		}
		
		
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(Object object) {
			this.salary=(double) object;
		}
		
		
		public String toString() {
			return " | "+this.empId+" | "+this.empName+" | "+this.salary;
		}

		public int getSalary1() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setSalary11(Object setSalary) {
			// TODO Auto-generated method stub
			
		}

		public void setSalary1(Object setSalary) {
			// TODO Auto-generated method stub
			
		} 
		

	}



