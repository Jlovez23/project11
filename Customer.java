import java.util.Scanner;
import java.io.*;

class Customer extends User implements Serializable {
	CheckingAccount checking; 
	SavingsAccount savings;
	
    	public static void main(String[] args){
		Customer customer = new Customer("Alice", "1111");
		if (customer.login()) {
			System.out.println("Login Successful");
			customer.start();
		}
		else {
			System.out.println("Login Failed");
		}
	}
	public Customer(){
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}
	public Customer(String userName, String  PIN){
		setUserName(userName);
		setPIN(PIN);
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}
	public void start(){
		boolean keepGoing = true;
		String response;
		while(keepGoing){
			response = menu();
			if (response.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}

			else if (response.equals("1")){
				System.out.println("Checking Account");
				checking.start();
			}
			else if (response.equals("2")){
				System.out.println("Savings Account");
				savings.start();
			}

			else if (response.equals("3"))
				this.changePIN();
			else 
				System.out.println("invalid input");
		}
	}	
	public String menu(){
		System.out.println("\nCustomer Menu \n");
		System.out.println("0) to quit");
		System.out.println("1) to manage Checking Account");
		System.out.println("2) to manage Savings Account");
		System.out.println("3) Change PIN");
		System.out.print("Action: ");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		return response;
	}
	void changePIN(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter new PIN: ");
		String newPIN = input.nextLine();

		setPIN(newPIN);

		System.out.println("PIN successfully changed.");
    	}
	public String getReport(){
    		return "Customer: " + getUserName() + "\nChecking Balance: $" + checking.getBalanceString() + "\nSavings Balance: $" + savings.getBalanceString();
	}
}
