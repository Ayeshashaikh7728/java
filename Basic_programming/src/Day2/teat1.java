package Day2;

import java.util.Scanner;

public class teat1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Emp e=new Emp();
	//	Emp e1=new Emp(101,"shaikh",10000);
		//System.out.println(e1);
	//	System.out.println(e);
	  //  System.out.println(e1);
		
		java.util.ArrayList<Employee> e=new java.util.ArrayList<Employee>();
		 Scanner sc =new Scanner(System.in);
		
		// System.out.println("do u want to continue");
	//char ch=sc.next().charAt(0) ;
		String name1;
		int flag=0;
		int flag2=0;
		char ch;
		do 
		{
			System.out.println(" 1] to add record \n 2] to display\n 3] to delete\n 4] 1]update name \n 2] update salary");
		
			 System.out.println("enter the choice");
			 int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enetr the id ");
				int id=sc.nextInt();
				System.out.println("enetr the name ");
				String name=sc.next();
				System.out.println("enetr the salary ");
				int sal=sc.nextInt();
				//System.out.println("record one");
				e.add(new Employee(id,name,sal));
				break;
			case 2:
			//	System.out.println("display record");
			//System.out.println(e);
				for(Employee empvar: e)
				{
					System.out.println(empvar);
				}
				break;
			case 3:
				System.out.println("enter the name to delete it___________________");
				name1=sc.next();
				for(int i = 0;i<e.size();i++)
				{
					if(e.get(i).getEmpName().equals(name1))
					{
						e.remove(i);
						System.out.println("sucsessfully deleted________________________");
					}
					flag=1;
					break;
				}
				
				break;
			case 4:
				System.out.println("4]1)update name\n 2) update salary");
				 int choice2=sc.nextInt();
				 switch(choice2) {
				 case 1:
					 
				 for(int i=0;i<e.size();i++)
				 { System.out.println("enter the name to be deleted");
					String nam =sc.next();
					if( e.get(i).getEmpName().equals(nam))
				
					{
						
						System.out.println("enetr new name to enter");
						
						String newnam=sc.next();
						e.get(i).setEmpName(newnam);
						System.out.println("name updated sucssesfully");
						 flag2 = 1;
						break;
					}
				
				 }
				 break;
				 
			 case 2:
					System.out.println("enetr the salary which u want to update");
					int checksal=sc.nextInt();
					System.out.println("enetr incrementper");
					int incrementper=sc.nextInt();
					 
					for(int i=0;i<e.size();i++) 
					{
					if(e.get(i).getSalary1()<checksal)
					{
						//e.get(i).setSalary1( e.get(i).setSalary(e.get(i).getSalary()*(incrementper/100+1)));
						System.out.println("salary updated sucessesfully___________");
						//System.out.print(e.get(i).setsal(e.get(i).getsal()*(incrementper/100+1));
					}
						break;
					}
				break;	
				};
				 
		
				
			default:
				System.out.println("invalid choice");
				break;
				
			}
			
			
			 System.out.println("do u want to continue");
				 ch=sc.next().charAt(0) ;
		}
		
		while(ch=='y'||ch=='Y');
		System.out.println("i am done");
		
		
		
	 
	
	}	
	
	
}
