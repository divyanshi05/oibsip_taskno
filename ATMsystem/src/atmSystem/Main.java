package atmSystem;

import java.util.Scanner;

public class Main {

		    public static void main(String[] args) {
		        ATMSystem atmSystem = new ATMSystem();
		        ATMSystem.User user = atmSystem.new User("Divyanshi", 1234, 20000.0);

		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("****** WELCOME  TO RNB ATM SYSTEM ******");

		        while (true) {
		            System.out.println("\n1. Login");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Deposit");
		            System.out.println("4. Transfer");
		            System.out.println("5. Transaction History");
		            System.out.println("6. Exit");
		            System.out.print("Select an option: ");

		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    user.Login();
		                    break;
		                case 2:
		                    user.WithDraw();
		                    break;
		                case 3:
		                    user.Deposit();
		                    break;
		                case 4:
		                    user.transfer();
		                    break;
		                case 5:
		                    user.transHistory();
		                    break;
		                case 6:
		                    System.out.println("Exiting the ATM system. Have a nice day!");
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        }
		    }
		


	}


