
public class MethodDemo2A {

	public static void main(String[] args) {
	System.out.println("main method start");
	func();
	MethodDemo2A m1=new MethodDemo2A();
	m1.funA();//invoking method A
	MethodDemo2A m2=new MethodDemo2A();
        m2.funB();//invoking method B
	
	System.out.println("Done");
	}
void funA()
{
	System.out.println("funA of MethodDemo2A");
}
void funB()
{
	System.out.println("funB of MethodDemo2A");
}
static void func()
{
	System.out.println("func of MethodDemo2A");
}
}
