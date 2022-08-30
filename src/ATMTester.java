
public class ATMTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM snoozle = new ATM(); 
		snoozle.openAccount(3747, 0);
		System.out.println(snoozle.checkBalance(3747));
		System.out.println(snoozle.depositMoney(3747, -200));
		System.out.println(snoozle.checkBalance(3747));
		snoozle.closeAccount(3747);
		System.out.println(snoozle.checkBalance(3747)); 
	}

}
