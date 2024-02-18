
public class PolyDemo4 {

	public static void main(String[] args) {
		PolyDemo4 p1=new PolyDemo4();
		p1.funA(10,20);
		p1.funA(10,20l);
	}
void funA(int a,int b)
{
	System.out.println("int int args of PolyDemo4");
}
void funA(int a,long b)
{
	System.out.println("long long args of PolyDemo4");
}
}
