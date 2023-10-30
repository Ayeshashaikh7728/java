package InnerClasses;

public class ClassInner {
	private String msg = "ayesha";
	private static int staticnum2=100;

	public ClassInner() {
		// TODO Auto-generated constructor stub
		System.out.println("outer constructor");
	}

	ClassInner(int a) {
		System.out.println(a);
		// System.out.println("ouetr var\t"+msg+"\tinner var"+num);
	}

	class inner {
		private int num = 100;

		inner() {
			System.out.println("inner constructor");
		}

		inner(int num) {
			System.out.println(num);
		}

		public void show() {
			System.out.println("hello");
			System.out.println("ouetr var\t" + msg + "\tinner var" + num);
			ClassInner obj = new ClassInner();
			obj.show();
		}

	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("outer class method show");
	}
	
	public static class inner2
	{
		inner2()
		{
			System.out.println("in static class ");
			System.out.println(staticnum2);
		}

		public static void show() {
			// TODO Auto-generated method stub
			System.out.println("show method of static inner class");
			
		}
	}

}
