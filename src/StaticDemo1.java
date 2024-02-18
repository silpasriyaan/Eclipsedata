
public class StaticDemo1 {
	static StaticDemo1 s1=new StaticDemo1();
///StaticDemo1 s1=new StaticDemo1();//stack overflow error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("main method start");
	StaticDemo1 s1=new StaticDemo1();
	System.out.println("Done");
}
	}


