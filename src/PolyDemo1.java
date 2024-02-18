
public class PolyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyDemo1 p1=new PolyDemo1();
p1.funA();
p1.funA(10);
p1.funA(10.23f);
p1.funA(123l);
}
	void funA()
	{
		System.out.println("zero args funA of PolyDemo1");
	}
	void funA(int a)
	{
		System.out.println("int args funA of PolyDemo1");
		System.out.println(a);
	}
	void funA(long b)
	{
		System.out.println("long args funA of PolyDemo1");
		System.out.println(b);
	}
void funA(float c)
{
	System.out.println("float args funA of PolyDemo1");
	System.out.println(c);
}
}
