package winzey_problem2;

public class SavingsAccount {
    static double annualInterestRate=0.05;
    private double savingsBalance=0;
    
	public SavingsAccount(double balance) {
		this.savingsBalance=balance;		
	}
	public double calculateMonthlyInterest(){
		return (this.savingsBalance*annualInterestRate)/12;
	}
	public double getBalance() {
		return savingsBalance;
	}
	public void modifyInterestRate(double in) {
    	annualInterestRate=in;
    }
	

}
