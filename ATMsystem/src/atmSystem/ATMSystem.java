package atmSystem;

import java.util.Scanner;

public class ATMSystem {
	 
		 
	 public class User{
		 private String userID;
		 private int userPin;
		 private double accountBalance;
		 int transactions = 0;
		 String transactionHistory = "";
		 
		 public User(String userID, int userPin, double accountBalance) {
			 this.userID=userID;
			 this.userPin=userPin;
			 this.accountBalance=accountBalance;
			 
		 }
		 
		 public void Login(){
			 Scanner sc=new Scanner(System.in);
			 

			 System.out.println("Enter your UserID");
			 String enteredUserID = sc.nextLine();

			 if (enteredUserID.equals(userID)) {
			     System.out.println("Enter your PIN");
			     int enteredUserPIN = sc.nextInt();

			     if (enteredUserPIN == userPin) {
			         System.out.println("Login successful!");
			       } 
			     else {
			         System.out.println("Incorrect PIN");
			     }
			  } 
			 
			 else {
			     System.out.println("Incorrect UserID");
			 }
          }
			 
		 
		 public void WithDraw() {

			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("Enter amount to withdraw: ");
			 float amount=sc.nextFloat();
			 
			 if(accountBalance>=amount) {
				 transactions++;
				 accountBalance-=amount;
				 System.out.println("\nWithdrawal successful!");
				 String str=amount+"Rs Withdrawn\n";
				 transactionHistory=transactionHistory.concat(str);
			 }
			 
			 else {
				 System.out.println("\nInsufficient Balance");
			 }
			 
			 
		 }
		 
		 
		 public void Deposit() {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("Enter amount to deposit: ");
			 float amount = sc.nextFloat();
			 
			 if(amount<=30000f) {
				 transactions++;
				 accountBalance+=amount;
				 System.out.println("\nSuccessfully Deposited!");
				 String str=amount+"Rs Deposited\n";
				 transactionHistory=transactionHistory.concat(str);
			 }
			 
			 else {
				 System.out.println("Limit is Rs.30000");
			 }
		 }
		 
		 
		 public void transfer() {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\nEnter recipient's name: ");
			 String recepient=sc.nextLine();
			 System.out.println("\nEnter amount to tranfer: ");
			 float amount=sc.nextFloat();
			 
			 if(accountBalance>=amount) {
				 if(amount<=20000f) {
					 transactions++;
					 accountBalance-=amount;
					 System.out.println("\nTransfer successfull to "+recepient);
					 String str=amount+"Rs Transferred\n";
						transactionHistory = transactionHistory.concat(str);
				 }
				 else {
					 System.out.println("Limit for transfer is Rs.20000");
				 }
			 }
			 else {
				 System.out.println("Insufficient Balance");
			 }
		 }

		 
		 public void transHistory() {
				if ( transactions == 0 ) {
					System.out.println("\nEmpty");
				}
				else {
					System.out.println("\n" + transactionHistory);
				}
			}
 	 }
		 
 }
	 
	 
	 
	


