
public class SavingsAccount extends BankAccount {
	
	public String name;
	
	public double interestRate;
	
	public SavingsAccount() {
		System.out.println(name);
		
	}
	public SavingsAccount(double interestRate) {
		this.interestRate=interestRate;
	}

		
		public void periodicInterest() {
			double newBalance = getBalance() * interestRate/100;
		deposite(newBalance);
		}
	}




//calculate periodic interest.