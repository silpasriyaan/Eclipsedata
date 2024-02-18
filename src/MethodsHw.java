
public class MethodsHw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fullMarks=100;
MethodsHw m1=new MethodsHw();
int lossMarks=fullMarks-m1.studentMarks();
//System.out.println(lossMarks);
}
int studentMarks()
{
	int internals=20;
	int externals=75;
	int gainMarks=internals+externals;
	System.out.println(gainMarks);
	return gainMarks;
}

}
