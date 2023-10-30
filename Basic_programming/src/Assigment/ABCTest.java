package Assigment;

import java.util.Scanner;

public class ABCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC ob=new ABC();
		Scanner sc =new Scanner(System.in);
		int salary;
		System.out.println("enter your salary");
		salary=sc.nextInt();
		ob.calculatesalary(salary);
		ob.perhoursalary();
		ob.netssalary();
	}

}
