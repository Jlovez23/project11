import java.util.Scanner;
import java.io.*;

public class CheckingAccount implements HasMenu, serializable{
	double balance;

	public static void main(String[] args){
		CheckingAccount account = new CheckingAccount();
		account.start();
	}
	public CheckingAccount(){
		balance = 0;
	}
	public void CheckingAccount(double balance){
		this.balance = balance;
	}
	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			String response = menu();
			if (response.equals("0"))
				keepGoing = false;
			else if (response.equals("1"))
				this.checkBalance();
			else if (response.equals("2"))
				this.makeDeposit();
			else if (response.equals("3"))
				this.makeWithdrawal();
			else 
				System.out.println("invalid input. You put " + response);
		}
	}
	public String menu(){
		System.out.println("press 0 to quit");
		System.out.println("press 1 to check balance");
		System.out.println("press 2 to make a deposit");
		System.out.println("press 3 to make a withdrawal");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		return response;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getBalanceString(){
		String balanceString = String.valueOf(this.balance);
		return balanceString;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void checkBalance(){
		System.out.println("Current Balance: " + this.getBalanceString());
	}
	private double getDouble(){
		Scanner input = new Scanner(System.in);
		String sResult = input.nextLine();
		double result = 0d;
		try {
			result = Double.parseDouble(sResult);
		} catch (Exception e){
			System.out.println("invalid input changing to 0");
			result = 0d;
		}
		return result;
	}
	public void makeDeposit(){
		System.out.println("how much to deposit?");
		double deposit = this.getDouble();
		this.balance += deposit;
	}
	public void makeWithdrawal(){
		System.out.println("how much to withdrawl?");
		double withdrawal = this.getDouble();
		if (withdrawal > this.getBalance()){
			System.out.println("Insufficient balance");
		} else {
			this.balance -= withdrawal;
			System.out.println("withdrawal complete \n new balance: " + this.getBalanceString());
		}
	}
}// end class def
