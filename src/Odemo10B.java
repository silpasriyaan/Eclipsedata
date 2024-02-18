
public class Odemo10B {
A getA(int x)
{
	A a1=new A();
	a1.i=x;
	a1.j=x+1;
	return a1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Odemo10B d1=new Odemo10B();
A x=d1.getA(4);
int i=d1.getA(6).i;
System.out.println(i);
int a=d1.getA(6).i;
System.out.println(a);

  A x2=d1.getA(6);
  int b=d1.getA(6).j;
System.out.println(b);   b

A x3=d1.getA(7).funA();
int b=d1.getA(7).funA();
System.out.println(d1.getA(8));

	}

}

