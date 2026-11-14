import java.util.Scanner;
import java.io.*;

class SavingsAccount extends CheckingAccount implements Serializable {
    	double interestRate;

    	public static void main(String[] args){
    		SavingsAccount account = new SavingsAccount();
		account.start();
	}
	void calcInterest(){
		this.balance += (this.getBalance() * this.getInterestRate());
	}
	void setInterestRate(){
		Scanner input = new Scanner(System.in);
		this.interestRate = interestRate;
	}
	double getInterestRate(){
		return this.interestRate;
	}
}
