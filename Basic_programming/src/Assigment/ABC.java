package Assigment;

import java.util.Scanner;

public class ABC {
 String month;
 int NoDays;
 int year;
 int date;
 double dsalary=0;
 int salary;
 double hsalary=0;
 int workinghr;
 int  netsalary=0;
	public int month(int NoDays)
	{  
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the date :");
		date=sc.nextInt();
		System.out.print("enter the month :" );
		month=sc.next();
		System.out.print("enter the year :" );
		year=sc.nextInt();
		this.NoDays=NoDays;
//		if(month=="jan"||month=="May"||month=="Mar"||month=="july"||month=="august"||month=="oct"||month=="dec")
//		{
//			NoDays=31;
//		}
//
//		
//		
//	     if(month=="feb")
//		{
//			if(year%4==0) {
//				NoDays=29;
//			}else {
//				NoDays=28;
//			}
//		}
//	     else
//	{
//		NoDays= 30;
//		}
//		
//		return NoDays;
		switch(month)
		{
		case "jan":
			NoDays=31;
			
			break;
		case "feb":
			if(year%4==0) {
			    NoDays=29;}
			else
				NoDays=28;
			break;
			
		case "mar":
			NoDays=31;
			break;
		case "apr":
			NoDays=30;
			break;
		case "may":
			NoDays=31;
			break;
		case "Jun":
			NoDays=30;
			break;
		case "Jul":
			NoDays=31;
			break;
		case "aug":
			NoDays=31;
			break;
		case "sep":
			NoDays=30;
			break;
		case "oct":
			NoDays=31;
			break;
		case "nov":
			NoDays=30;
			break;
		case "dec":
			NoDays=31;
			break;
		default:
			System.out.println("not a month");
			break;
		}
//		if (NoDays==30)
//				
//		{
//			workinghr=30*8;
//		}
		return NoDays;
	}
public void calculatesalary(int salary)
{ this.salary=salary;

	dsalary=salary/month(NoDays);
	System.out.println("per day salary="+dsalary);
	//return dsalary;
	
	}
public void perhoursalary()
{
//	double hsalary =calculatesalary(salary) /24;
//	System.out.println(dsalary);
	 hsalary =dsalary/8;
	
	System.out.println("per hour salary:  "+hsalary);
	
}
public void netssalary()
{ 
//	System.out.println(hsalary);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  the working hour");
	workinghr=sc.nextInt();
	netsalary=(int) (hsalary* workinghr);
	System.out.println("netsalary is : "+netsalary);
	}
}
