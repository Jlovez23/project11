import java.util.Scanner;
import java.io.*;

abstract class User implements HasMenu, Serializable {
        String userName;
        String PIN;

        public boolean login(){
                Scanner input = new Scanner(System.in);

                System.out.print("Enter username: ");
                String userName = input.nextLine();

                System.out.print("Enter PIN: ");
                String PIN = input.nextLine();

                return login(userName, PIN);
        }

        public boolean login(String userName, String PIN){
                boolean Access = false;
                if (this.userName.equals(userName)){
                        if (this.PIN.equals(PIN)){
                                Access = true;
			}
		}
                return Access;
        }

        public void setUserName(String userName){
                this.userName = userName;
        }

        public String getUserName(){
                return this.userName;
        }

        public void setPIN(String PIN){
		this.PIN = PIN;
	}

        public String getPIN(){
                return this.PIN;
        }

	public abstract String getReport();
}
