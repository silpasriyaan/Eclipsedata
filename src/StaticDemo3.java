
public class StaticDemo3 {
int x=10;
static int y=20;
A a1=new A();
static A a2=new A();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticDemo3 s1=new StaticDemo3();
System.out.println(s1.x);
System.out.println(s1.a1.i);
s1.a1.funA();

System.out.println(y);
System.out.println(a2.i);
a2.funA();
	}

}
