
public class MethodDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodDemo7 m1=new MethodDemo7();
m1.funB();
System.out.println("Done");
	}
void funA()
{
	System.out.println("funA of MethodDemo7");
}
void funB()
{
	System.out.println("funB of MethodDemo7");
	MethodDemo7 m1=new MethodDemo7();
	m1.funA();
}
}