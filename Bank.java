import java.io.*;
import java.util.Scanner;

public class Bank implements HasMenu{
	Admin Admin;
	Customer CustomerList;

	public static void main(String[] args){
		Bank B = new Bank();
	}

	public void start(){
		boolean keepGoing = true;
		this.Admin = new Admin();
		while(keepGoing){
			String response = menu();
			if (response.equals("0"))
				keepGoing = false;
			else if (response.equals("1"))
				System.out.println("log in to Customer here");
				//loginAsCustomer();
			else if (response.equals("2")){
				System.out.println("log in to Admin here");
				/*
				if (Admin.login())
					AdminStart();
				else
					System.out.println("Login failed");
				*/
			}
		}//end while
	}

	public Bank(){
		//this.loadSampleCustomers();
		//this.saveCustomers();
		//this.loadCustomers();
		//this.start();
		//this.saveCustomers();
	}//end constructor
/*
	public void loadSampleCustomers(){
		
	}

	public void loadCustomers(){

	}

	public void saveCustomers(){
	
	}

	public void fullCustomerReport(){
		for(Customer* Customer : Customers){
			String report = this.getreport();
			System.out.println(report);
		}
	}

	public void addUser(){

	}

	public void applyinterest(){

	}

	public void loginAsCustomer(){

	}
*/
	public String Menu(){
		String response;
		System.out.println("\nBank menu\n");
		System.out.println("0) exit system");
		System.out.println("1) login as Admin");
		System.out.println("2) login as Customer");
		System.out.print("\nAction: ");
		Scanner input = new Scanner(System.in);
		response = input.nextLine();
		return response;
	}
/*
	public void AdminStart(){
		boolean keepGoing = true;
		String response;
		Scanner input = new Scanner(System.in);
		response = Admin.menu();
		while(keepGoing){
			if (response.equals("0"))
				keepGoing = false;
			else if (response.equals("1")){
				fullCustomerReport();
			}
			else if (response.equals("2")){
				System.out.println("Add user stuff");
			}
			else if (response.equals("3")){
				for (Customer* Customer : Customers)
					this.SavingsAccount.calcInterest();
			}
		}
	}	
*/
}//end Bank def

class CustomerList extends ArrayList<Customer>{}
