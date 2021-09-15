import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account("6605641264","Manikandan",0.0);
		Account acc2 = new Account();
		/*
		 * acc1.setName("Manikandan"); acc1.setBalance(1000.0);
		 * acc1.setNumber("6605641264");
		 */
		
		
		
		
		System.out.println("Account Number : "+acc1.getNumber());
		System.out.println("Account Holder : "+acc1.getName());
		System.out.println("Account Balance : "+acc1.getBalance());
		acc1.deposit(1000);
		acc1.deposit(500);
		acc1.withDraw(3000);
		
	}
}
