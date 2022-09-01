
public class PersonalTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM snoozle = new ATM(); 
		snoozle.openAccount(3747, 5);
		System.out.println(snoozle.checkBalance(3747)); // RETURN 5
		System.out.println(snoozle.depositMoney(3747, -200)); //return false
		System.out.println(snoozle.checkBalance(3747)); //return 5
		System.out.println(snoozle.withdrawMoney(3747, 10)); //return false
		System.out.println(snoozle.withdrawMoney(3747, 5)); //return true
		snoozle.closeAccount(3747); //hoo
		System.out.println(snoozle.checkBalance(3747));  //return 0.0
	}
}
