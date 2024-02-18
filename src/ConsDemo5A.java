
public class ConsDemo5A {//students details like schoolname, principal name static and student name,fathers name,
	//phn,no changes so non-static
	int a=5;
	static int b=40;
public static void main(String[] args) {
	{
		System.out.println("Main method Start");
		b=50;
		ConsDemo5A c1=new ConsDemo5A();
		c1.a=10;// we are updating object value i.e., first student name
		ConsDemo5A c2=new ConsDemo5A();
		c2.a=20;
		ConsDemo5A c3=new ConsDemo5A();
		c3.a=30;
		System.out.println("Done");
	}

	}

}
