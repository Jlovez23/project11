import java.util.Scanner;

class Admin extends User{
	
	public static void main(String[] args){
		Admin a = new Admin();
		a.login();
	}
	public void start(){}

	public Admin(){
		setUserName("admin");
		setPIN("0000");
	}
	
	public String menu(){
		System.out.println("\nAdmin Menu \n");
		System.out.println("0) to quit");
		System.out.println("1) Full customer report");
		System.out.println("2) Add User");
		System.out.println("3) Apply interest to savings account");
		System.out.print("Action: ");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		return response;
	}
	public String getReport(){
		String report = "Admin Username: " + this.getUserName();
		report += "Admin PIN: " + this.getPIN();

		return report;
	}
}//end Admin def
