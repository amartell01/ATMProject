
import java.util.*; 

public class ATM {
	
	//private int accountNumber; 
//	private double balance;
	private HashMap<Integer, Double> accounts = new HashMap<Integer, Double>();
	
	public void openAccount (int accountNumber) {
		//this.accountNumber = accountNumber;
		accounts.put(accountNumber, 0.0);
	}
	
	public void openAccount(int accountNumber, double balance) {
		//this.accountNumber = accountNumber;
		//this.balance = balance;
		accounts.put(accountNumber, balance);
	}
	
	//closes the account, only if there is no balance
	public void closeAccount(int accountNumber) {
		if (accounts.get(accountNumber) == 0) {
			accounts.remove(accountNumber, accounts.get(accountNumber));
		}
	}
	
	//returns a double the exact account value of all deposits into the account
	//returns 0.0 if there is no valid account
	public double checkBalance (int accountNumber) {
		if (accounts.containsKey(accountNumber)) {
			return accounts.get(accountNumber); 
		} else {
			return 0.0; 
		}
	}
	
	//returns true/false depending on success or failure of deposit
	public boolean depositMoney (int accountNumber, double depositAmt) {
		if (depositAmt > 0 && accounts.get(accountNumber) != null) {
			
			double current = accounts.get(accountNumber);
			
			current += depositAmt;
			current = Math.round(current * 100);
			current = current / 100; 
			accounts.put(accountNumber, current);
			
			//accounts.put(accountNumber, current + depositAmt);			
			
			return true; 
		} else {
			return false;
		}
		
	}
	
	//returns true/false depending on success or failure of deposit
	public boolean withdrawMoney (int accountNumber, double withdrawAmt) {
		
	
		if (accounts.get(accountNumber) == null || withdrawAmt > accounts.get(accountNumber) || withdrawAmt < 0) {
			return false; 
		} else {
			double current = accounts.get(accountNumber);
			current -= withdrawAmt;
			current = Math.round(current * 100);
			current = current / 100; 
			accounts.put(accountNumber, current); 
			return true; 
		}
	}
}
