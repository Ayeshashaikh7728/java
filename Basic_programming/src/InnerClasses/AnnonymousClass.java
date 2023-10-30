package InnerClasses;

class AnnonymousClass {

	void show() {
		// TODO Auto-generated method stub
		System.out.println("show announymous");
	}

}

   class abc {
	static AnnonymousClass d = new AnnonymousClass();

	void see() {
		// TODO Auto-generated method stub

	//	super.show();

	}

	public static void main(String[] args) {
		d.show();
	}
}
