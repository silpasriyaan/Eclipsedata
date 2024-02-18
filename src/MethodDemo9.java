
public class MethodDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodDemo9 m1=new MethodDemo9();
m1.funA();
m1.funB();
System.out.println("done");
//System.out.println(m1.funB());
	}
void funA()
{
	System.out.println("funA of MethodDemo9");
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}
int funB()
{
	System.out.println("funB of MethodDemo9");
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
return 3000;
//return c;// 30
//return b;//20
}
}
