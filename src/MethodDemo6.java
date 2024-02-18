
public class MethodDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method of MethodDemo6");
	funB();
	System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of MethodDemo6");
	}
	static void funB()
	{
		System.out.println("funB of MethodDemo6");
MethodDemo6 m1=new MethodDemo6();
m1.funA();
	}

}
