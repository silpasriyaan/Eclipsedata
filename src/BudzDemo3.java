
public class BudzDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grossSalary=10000;
		BudzDemo3 bd1=new BudzDemo3();
		int netSalary=grossSalary-bd1.houseCharges();
		System.out.println(netSalary);
int taxCal=30*bd1.houseCharges();
System.out.println(taxCal);
System.out.println(bd1.houseCharges());
	}
int houseCharges()
{
	int rent=1000;
	int childFee=2000;
	int totalCharges=rent+childFee;
	//System.out.println(totalCharges);
	return 10;
}
}
