
public class PolyDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PolyDemo3 p1=new PolyDemo3();
p1.funA(true,5);
p1.funA(25,false);
	}
void funA(int a,boolean b)
{
	System.out.println("int boolean args of PolyDemo3");
}
void funA(boolean b,int a)
{
	System.out.println("boolean int args of PolyDemo3");
}
}
