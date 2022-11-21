package NextOne;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println(75000);
	}
	
	public static void main(String[] args) {
		AxisBank account=new AxisBank();
		account.deposit();
		account.fixed();
		account.saving();
	}

}
