
public class PolyDemo5 {
public static void main(String[] args) {
		PolyDemo5 p1=new PolyDemo5();
		A m=new A();
		//m=null;
		p1.funA(m);
		B n=new B();
		n=null; 
		p1.funA(n);
		C k=new C();
        p1.funA(k);
	}
void funA(A a1)
{
	System.out.println(a1);
}
void funA(B b1)
{
	System.out.println(b1);
}
void funA(C c1)
{
	System.out.println(c1);
}
}
