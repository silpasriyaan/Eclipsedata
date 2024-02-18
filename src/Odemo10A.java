public class Odemo10A {
public static void main(String[] args) {
	Odemo10A d1=new Odemo10A();
d1.funA();
d1.funB();
d1.funC();
d1.funD();
d1.funE();
	}
void funA()
{
	System.out.println("funA of Odemo10A");
}
int funB()
{
	System.out.println("funB of Odemo10A");
	return 10;
}
boolean funC()
{
	System.out.println("funC of Odemo10A");
	return true;
}
Ramesh funD()
{
	System.out.println("funD of Odemo10A");
	Ramesh r1=new Ramesh();
	//return r1;
	//return new Ramesh();
return null;
}
	variableDemo1 funE()
{
	System.out.println("funE of Odemo10A");
	//variableDemo1 v1=new variableDemo1();
	//return v1;
	return new variableDemo1();
	//return null;
}
}
