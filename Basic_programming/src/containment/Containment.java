package containment;

import java.util.ArrayList;
import java.util.Arrays;

class emp
{
	private int empid;
	private String name;
	private int salary;
	public emp()
	{
		System.out.println("default emp");
		this.empid=1;
		this.name="";
		this.salary=0;
	}
	public emp(int empid,String name,int salary){
		System.out.println("par emp");
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	public  String toString()
	{
		return "name: \t "+name+"  empid:\t "+empid+"  salary:\t "+salary;
		
	}
}





class org{
	//private emp em; //creationg var of emp class
	private ArrayList<emp>[] em1;
	private emp[] em;
	private String orgname;
	private String location;
	
	public org()
	{ System.out.println("default org");
		this.orgname="";
		this.location="";
		//this.em=new emp[0];
	}
//	public org(String orname,String loc,int salary,int emid,String name)
	public org(String orname,String loc,int size)
	{
		System.out.println("par  constructor org");
		this.location=loc;
		this.orgname=orname;
		//this.em=new emp(emid,name,salary);//containment
	//	this.em=new ArrayList<emp>;
	}
	public org(String orname,String loc,emp[] em)
	{
		System.out.println("par  constructor org");
		this.location=loc;
		this.orgname=orname;
		//this.em=new emp(emid,name,salary);//containment
		this.em=em;
}
//	public org(String name,String loc,ArrayList<emp> e1)
//	{
//		this.location=loc;
//		this.orgname=name;
//		this.em1=(ArrayList<emp>[]) e1.toArray();
//	}
	
	public String toString()
	{
		//return Arrays.toString(em)+" \tlocation:\t"+location+"  orgname:\t"+orgname;
		return em.toString()+" \tlocation:\t"+location+"  orgname:\t"+orgname;
	}
}
public class Containment {
public static void main(String[] args) {
	org o=new org();//calling default constructor
	//org ob=new org("mavrick","pune",50000,1,"ayesha");
	//System.out.println(ob);
emp emplist[]= new emp[5];
//	emplist[0]=new emp(101,"Eshan",10000);
//	emplist[1]=new emp(102,"Priya",20000);
//	emplist[2]=new emp(103,"Anand",30000);
//	emplist[3]=new emp(104,"Manish",40000);
//	emplist[4]=new emp(105,"Tanish",50000);
//	//emp emlist=new emp(1,"ayesha",30000);
	emp ob=new emp(101,"Eshan",10000);
	ArrayList<emp> el=new ArrayList<>();
	el.add(ob);
	System.out.println();
	el.remove(0);
	org org1=new org("MYOrg","pune",emplist);
	System.out.println(org1);
	
	
//	Oraganization org1=new Oraganization("MYOrg","pune",5);
	
}
}
