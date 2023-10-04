package Basic_java;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Day1 {
	private int real;
	private int pri;
	/*public Day1() //default constructor 
	{
		real=0;
		pri=0;
		System.out.println("constructor exicuted\t"+real+pri);
	}*/
  /*public void destructor() { //destructor
	}*/
/*	Day1(int real,int pri)// parameterized constructor
	{
		this.real=real;
		this.pri=pri;
		System.out.println("real value"+real+pri);
		System.out.println(real+pri);
	}*/
	
public void show()

{System.out.println("values\t"+real+"  "+pri);
	
	}
public void accept() throws NumberFormatException, IOException
{/* first method
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the value");
	this.real=Integer.parseInt(in.readLine());
	System.out.println("enter the value");
	this.pri=Integer.parseInt(in.readLine());
	System.out.println(real+pri);*/
	
	 
/*	
 *  second method
 * Scanner sc =new Scanner(System.in);
	System.out.println("enter the value");
	this.real=sc.nextInt();
	System.out.println("enter the value");
	this.pri=sc.nextInt();
	System.out.println(real+pri);
	*/
	//third method
	
/*	this.real=Integer.parseInt(JOptionPane.showInputDialog("enter the firdt"));
	this.pri=Integer.parseInt(JOptionPane.showInputDialog("enter the firdt"));
	JOptionPane.showMessageDialog(null,"values are"+this.real+this.pri);*/
			
	}
public String toString()
{ this.real=30;
	return "values are "+real+"  "+pri;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        Day1 d1=new Day1();
        //Day1 d2=new Day1(30,20);
       // System.out.println(d1+" ayesha");
       // System.out.println(d1.pri);
       // d1.show();
     /*   for(int i=0;i<10;i++)
        {
        	System.out.println(i);
        }*/
       // d1.accept();
        System.out.println(d1);
	}
	

}
