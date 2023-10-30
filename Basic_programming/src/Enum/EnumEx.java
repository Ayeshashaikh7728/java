package Enum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EnumEx {
	static size pizzasize;
enum size 
{
	SMALL,MEDIUM,LARGE;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		 pizzasize=sc.next();		
		System.out.println("eneter your choice");
		System.out.println("small,medium,large");
		String choice=getInput("Enter the choice");
		//size pizzasize=choice.SMALL;
switch(pizzasize)
{
case SMALL:
	System.out.println("rs:200");
	break;
case LARGE :
	System.out.println("rs:800");
	break;
case MEDIUM:
	System.out.println("rs:500");
	break;
	default:
		System.out.println("enter the size of pizza");
		break;
}
	}
	 private static String getInput(String prompt)
     {
     BufferedReader stdin = new BufferedReader(
             new InputStreamReader(System.in));
     System.out.print(prompt);
     System.out.flush();
     try{
         return stdin.readLine();
     } catch (Exception e){
         return "Error: " + e.getMessage();
     }
 }

}
