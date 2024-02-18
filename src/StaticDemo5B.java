
public class StaticDemo5B {
	int a=funA();
	static int b=funB();
public static void main(String[] args) {
System.out.println("main method start");
System.out.println(b);
new StaticDemo5B();
new StaticDemo5B();
new StaticDemo5B();
System.out.println("Done");

	}
int funA()
{
	System.out.println("funA of StaticDemo5B");
	return 10;
}
static int funB()
{
	System.out.println("funB of staticDemo5B");
	return 20;
}
}
