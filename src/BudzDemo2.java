
public class BudzDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grossSalary=10000;
		BudzDemo2 bd1=new BudzDemo2();
		int netSalary=grossSalary-bd1.houseCharges();
		System.out.println(netSalary);
		
}
 int houseCharges()
{
	int rent=1000;
	int childFee=2000;
	int totalCharges=rent+childFee;
	System.out.println("totalCharges");
return totalCharges;
}
}
