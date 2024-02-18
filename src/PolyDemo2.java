
public class PolyDemo2 {

	public static void main(String[] args) {
	PolyDemo2 p1=new PolyDemo2();
	p1.funA();
	p1.funA(10);
	p1.funA(20,30);
	p1.funA(true,'b');
	}
void funA()
{
	System.out.println("Zero args funA of PolyDemo2");
}
void funA(int a)
{
	System.out.println("int args funA of PolyDemo2");
	
}
void funA(int a, int b)
{
	System.out.println("int int args of funA of PolyDemo2");
}
void funA(boolean a,char b)
{
	System.out.println("boolean char args of funA of PolyDemo2");
}
}