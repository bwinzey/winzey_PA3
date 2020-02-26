package winzey_problem2;

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1=new SavingsAccount(2000);
		SavingsAccount saver2=new SavingsAccount(3000);
		saver1.modifyInterestRate(0.04);
		System.out.println("Saver1 balance: "+saver1.getBalance());
		System.out.println("Saver1 monthly interest: "+saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "+saver2.getBalance());
		System.out.println("Saver2 monthly interest: "+saver2.calculateMonthlyInterest());
		saver1.modifyInterestRate(0.05);
		System.out.println("Saver1 balance: "+saver1.getBalance());
		System.out.println("Saver1 monthly interest: "+saver1.calculateMonthlyInterest());
		System.out.println("Saver2 balance: "+saver2.getBalance());
		System.out.println("Saver2 monthly interest: "+saver2.calculateMonthlyInterest());
		
	}

}
