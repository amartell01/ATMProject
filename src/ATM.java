
public class ATM {
	public void openAccount (int accountNumber) {
		
	}
	
	public void openAccount(int accountNumber, double depostAmt) {
		
	}
	
	//closes the account, only if there is no balance
	public void closeAccount(int accountNumber) {
		
	}
	
	//returns a double the exact account value of all desposits into the account
	//returns 0.0 if there is no valid account
	public double checkBalance (int accountNumber) {
		return 0.0;
	}
	
	//returns true/false depending on success or failure of deposit
	public boolean depositMoney (int accountNumber, double depositAmt) {
		return true; 
	}
	
	//returns true/false depending on success or failure of deposit
	public boolean withdrawMoney (int accountNumber, double withdrawAmt) {
		return true;
	}
}
