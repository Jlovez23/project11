import java.util.Scanner;

class Admin extends User{
	public static void main(String[] args){
		start();
	
	public void start(){}

	public Admin(){
	}
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
	public void getReport(){
		for (
	}


}//end Admin def
