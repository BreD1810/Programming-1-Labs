
public class ATM {

		public int balance = -1; //Negative so that the initial negative balance check loop runs
		
		public void go() {
			Toolbox myToolbox = new Toolbox();
			int choice; //Stores the users choice
			
			//Get a starting balance
			System.out.println("Welcome to online ATM banking");
			while (balance <= 0) { //Runs a loop until the users enters a positive number
				System.out.println("How much do you want in your account?");
				balance = myToolbox.readIntegerFromCmd();
				if (balance <= 0) {
					System.out.println("You cannot start with a negative balance");
				}
			}
			
			while(true) { //Runs infinitely (or until the program is quit using System.quit(0);)
				//Print the menu and take an input from the user
				System.out.println("What do you want to do?");
				System.out.println("1 : Withdraw");
				System.out.println("2 : Desposit");
				System.out.println("3 : Inquire");
				System.out.println("4 : Quit");
				choice = myToolbox.readIntegerFromCmd();
				
				//Complete an action based on the user input
				if(choice == 1) {
					withdraw();
				} else if (choice == 2) {
					deposit();
				} else if (choice == 3) {
					inquire();
				}else if(choice == 4) {
					quit();
				}else{
					System.out.println("You entered in an incorrect number");
				}
			}
		}
		
		public void withdraw() {
			//Take money out of the account
			Toolbox myToolbox = new Toolbox();
			int withdrawAmount;
			int backupBalance; //Needed incase the users balance becomes negative
			
			System.out.println("*****************************************");
			System.out.println("               Withdrawal                ");
			System.out.println("*****************************************");
			System.out.println("How much would you like to withdraw?");
			
			withdrawAmount = myToolbox.readIntegerFromCmd();
			if (withdrawAmount >= 0) { //Checks for negative withdrawal amounts
				backupBalance = balance; //Backup the old balance
				balance = balance - withdrawAmount;
				
				if (balance <= 0) { 
					//If the users balance becomes negative, return the balance to the backup, and alert the user
					System.out.println("*****************************************");
					System.out.println("  Withdrawal failed - insufficient funds ");
					System.out.println("*****************************************");
					
					balance = backupBalance;
				} else {
					//Withdraw funds
					System.out.println("*****************************************");
					System.out.println("         You balance is " + balance + "               ");
					System.out.println("*****************************************");
				}
				
			} else{
				System.out.println("You cannot withdraw a negative amount.");
			}
		}
		
		public void deposit() {
			//Put money into the account
			Toolbox myToolbox = new Toolbox();
			int depositAmount;
			
			System.out.println("*****************************************");
			System.out.println("                Deposit                  ");
			System.out.println("*****************************************");
			System.out.println("How much would you like to deposit?");
			
			depositAmount = myToolbox.readIntegerFromCmd();
			if(depositAmount >= 0){ //Checks if the user enters a negative amount
				balance = balance + depositAmount;
				
				System.out.println("*****************************************");
				System.out.println("       Your balance is " + balance + "                 ");
				System.out.println("*****************************************");
			}else {
				System.out.println("You cannot deposit a negative amount.");
			}
		}
		
		public void inquire() {
			//Display the account balance
			System.out.println("*****************************************");
			System.out.println("       Your balance is " + balance + "                 ");
			System.out.println("*****************************************");
		}
		
		public void quit() {
			//Exit the program
			System.out.println("*****************************************");
			System.out.println("               GoodBye!                  ");
			System.out.println("*****************************************");
			
			System.exit(0);
		}
		
		public static void main(String[] args) {
				ATM myATM = new ATM();
				myATM.go();
		}
		
}