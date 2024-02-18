
public class MethodsDemoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodsDemoEx e1= new MethodsDemoEx();
		e1.funA();
		e1.funB(10, 5);
		func();
		fund(10,20);
		e1.fune();
		e1.funf(2, 3, 4);
		fung();
		funh(100,20);
	}
void funA()
{
int a=10;
int b=20;
int c=a*b;
System.out.println(c);
}
void funB(int a,int b)
{
	int c=a-b;
	System.out.println(c);
}
static void func()
{
	float l=6;
	float m=7;
float  n=l+m;
	System.out.println(n);
}
static void fund(int a,int b)
{
	//int a=10;
	//int b=20;
	int c=a+b;
	System.out.println(c);
}
int fune()
{
 int a=10;
 int b=8;
 int c=a+b;
 System.out.println(c);
 return c;
}
int funf(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
	return 3000;
}
static int fung()
{
	int a=10;
	int b=2;
	int c=a*b;
	System.out.println(c);
	return 9;
}
static float funh(float a, float b)
{
	
	float c=a+b;
	System.out.println(c);
	return 100;
}
}
