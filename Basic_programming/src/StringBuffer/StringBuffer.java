package StringBuffer;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("ayesha");
		sb.append(" shaikh");
		sb.insert(0, "iqbal   ");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuilder sb2=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb2);//prints Hello Java  


		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello  


		StringBuilder sb11=new StringBuilder("Hello");  
		sb11.replace(1,3,"Java");  
		System.out.println(sb11);//prints HJavalo  


		StringBuilder sb111=new StringBuilder("Hello");  
		sb111.delete(1,3);  
		System.out.println(sb111);//prints Hlo  


		StringBuilder sb22=new StringBuilder("Hello");  
		sb.reverse();  
		System.out.println(sb22);//prints olleH  


	}

}
