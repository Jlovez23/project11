import java.io.*;
import java.util.*;

public class Bank implements HasMenu{
	Admin Admin;
	CustomerList Customers = new CustomerList();

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
				if (Admin.login())
					AdminStart();
				else 
					System.out.println("Login failed");
			
			else if (response.equals("2")){
				loginAsCustomer();
			}
		}//end while
	}

	public Bank(){
		//this.loadSampleCustomers();
		//this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();
	}//end constructor

	public void loadSampleCustomers(){
		Customers.add(new Customer("Alice", "1111"));
		Customers.add(new Customer("Bob", "2222"));
		Customers.add(new Customer("Charlie", "3333"));
	}

	public void loadCustomers(){
		try {
			FileInputStream fis = new FileInputStream("Customers.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Customers = (CustomerList) ois.readObject();

			ois.close();
			fis.close();

			System.out.println("Customers loaded.");
		}
		catch(Exception e) {
			System.out.println("No Customers loaded.");
		}
	}

	public void saveCustomers(){
		try {
			FileOutputStream fos = new FileOutputStream("Customers.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(Customers);

			oos.close();
			fos.close();
			System.out.println("Customers saved.");
		}
		catch(Exception e) {
			System.out.println("Save failed.");
			System.out.println(e.getMessage());
		}
	}

	public void fullCustomerReport(){
		for(Customer Customer : Customers){
			String report = Customer.getReport();
			System.out.println(report);
		}
	}

	public void addUser(){
		Scanner input = new Scanner(System.in);

		System.out.println("Username: ");
		String userName = input.nextLine();
		System.out.print("\nPIN: ");
		String PIN = input.nextLine();
		Customer customer = new Customer(userName, PIN);

		Customers.add(customer);
		System.out.println("Customer added.");
	}

	public void applyInterest(){
		for (Customer Customer : Customers) {
			Customer.savings.calcInterest();
			System.out.println(Customer.getReport());
		}
		System.out.println("Interest applied.");
	}

	public void loginAsCustomer(){
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;

		System.out.print("Username: ");
		String userName = input.nextLine();

		System.out.print("PIN: ");
		String PIN = input.nextLine();
		
		for (Customer Customer : Customers) {
			if (Customer.login(userName, PIN)) {
				Customer.start();
				return;
			}
		}
	}

	public String menu(){
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

	public void AdminStart(){
		boolean keepGoing = true;
		String response;
		Scanner input = new Scanner(System.in);
		while(keepGoing){
			response = Admin.menu();
			if (response.equals("0"))
				keepGoing = false;
			else if (response.equals("1")){
				fullCustomerReport();
			}
			else if (response.equals("2")){
				addUser();
			}
			else if (response.equals("3")){
				applyInterest();
			}
			else
				System.out.println("Invalid input");
		}
	}

}//end Bank def

class CustomerList extends ArrayList<Customer>{}
