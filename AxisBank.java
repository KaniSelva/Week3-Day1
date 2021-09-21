package methodOverriding;

public class AxisBank extends BankInfo {

	
	public void Deposit() {
		
		System.out.println("The deposited amount is calculated in Axis bank");
		
	}
	public static void main(String[] args) {
		AxisBank B = new AxisBank();
		B.deposit();
		B.Deposit();

	}

}
