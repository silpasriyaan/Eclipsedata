
public class ConsDemo5 {
	int a=5;
	ConsDemo5()
	{
		System.out.println("cons of ConsDemo5");
		 a=10;
	}

	public static void main(String[] args) {

System.out.println("main method start");
ConsDemo5 c1=new ConsDemo5();
System.out.println(c1.a);
System.out.println("Done");
	}

}
