
public class PolyDemo4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyDemo4A p1=new PolyDemo4A();
p1.funA(5l, 6);
p1.funA(11, 12l);

	}
void funA(int a,long b)
{
	System.out.println("int int args of funA of PolyDemo4A");
}
void funA(long a,int b)
{
	System.out.println("long int args of funA of PolyDemo4");
}
}
