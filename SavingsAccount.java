import java.util.Scanner;
import java.io.*;

class SavingsAccount extends CheckingAccount implements Serializable {
    	double interestRate = .05d;

    	public static void main(String[] args){
    		SavingsAccount account = new SavingsAccount();
		account.start();
	}
	void calcInterest(){
		this.balance += (this.getBalance() * this.getInterestRate());
	}
	double getInterestRate(){
		return this.interestRate;
	}
}
