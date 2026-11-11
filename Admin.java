import java.util.Scanner;

class Admin extends User{
	String userName;
	String PIN;

	public static void main(String[] args){
		Admin a = new Admin("admin" , "0000");
		a.login();

	public void start(){}

	public Admin(){}

	public Admin(String userName, String PIN){
		setUserName(userName);
		setPIN(PIN);
	}
	public String menu(){
		System.out.println("\nAdmin Menu \n");
		System.out.println("0) to quit");
		System.out.println("1) Full customer report");
		System.out.println("2) Add User");
		System.out.println("3) Apply interest to savings account");
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
