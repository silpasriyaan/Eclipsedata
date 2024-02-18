
public class ConsDemo6 {
	int a=15;
	ConsDemo6()
	{
		System.out.println("cons of ConsDemo6");
int  a=20;
	}

	public static void main(String[] args) {
	System.out.println("Main method start");
	ConsDemo6 c1=new ConsDemo6();
	System.out.println(c1.a);
	System.out.println("Done");
	}

}
