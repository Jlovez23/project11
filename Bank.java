public class Bank implements HasMenu{
	public static void main(String[] args){
		start();
	}

	public void start(){
		
	}

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

	public void AdminStart(){
		Admin.start()

	}

