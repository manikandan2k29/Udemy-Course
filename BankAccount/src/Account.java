
public class Account {
	private String number;
	private String name;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
		this("Default number","Default name",0) ;
		
	}
	public Account(String number,String name,double balance) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public void deposit(double dep) {
		// TODO Auto-generated method stub
		this.balance+=dep;
		System.out.println("Deposit of "+ dep +" made successfully! Available balance : "+balance);
	}
	public void withDraw(double withdraw) {
		// TODO Auto-generated method stub
		if (this.balance - withdraw < 0) {
			System.out.println("Only "+balance+" available. Withdrawal denied!");
		}else {
			this.balance-=withdraw;
			System.out.println("Withdrawal of "+ withdraw +" made successfully! Available balance : "+balance);
		}
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

		
}
