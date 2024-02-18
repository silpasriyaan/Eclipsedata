
public class Odemo8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Odemo8A d1=new Odemo8A();
//Ramesh r1=new Ramesh();
d1.funA();
d1.funB(10);
d1.funC(true);
//d1.funD(r1);---7&11set   or only  12th statement
d1.funD(new Ramesh());
d1.funD(null);
	}
void funA()
{
	System.out.println("funA of Odemo8A");
}
void funB(int a)
{
	System.out.println("funB of Odemo8A");
}
void funC(boolean b)
{
	System.out.println("funC of Odemo8A");
}
void funD(Ramesh d)
{
	System.out.println(d);
	System.out.println("funD of Odemo8A");
}
}
