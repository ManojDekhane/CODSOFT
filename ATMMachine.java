package com.company;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance = 10000;
        float deposit;
        float withdraw;
        System.out.println("*** Welcome to ATM machine ***");
        System.out.println("1. Withdrawal");
        System.out.println("2. Deposit");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Exit");
        System.out.println("Choose the transaction : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter the amount to withdraw : ");
                withdraw = sc.nextFloat();
                if(balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money!");
                } else {
                    System.out.println("Insufficient Balance");
                }
                while(true) {
                    System.out.println("Do you want to check your balance ? (Y/N)");
                    char secondChoice = sc.next().charAt(0);
                    if(secondChoice == 'Y'){
                        System.out.println("Available balance :-  "+balance);
                        break;
                    } else if(secondChoice == 'N') {
                        System.exit(0);
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
                break;
            case 2:
                System.out.println("Enter the amount to be deposited");
                deposit = sc.nextFloat();
                balance = balance + deposit;
                System.out.println("Your money has been successfully deposited");
                while(true) {
                    System.out.println("Do you want to check your balance ? (Y/N)");
                    char secondChoice = sc.next().charAt(0);
                    if(secondChoice == 'Y'){
                        System.out.println("Available balance :-  "+balance);
                        break;
                    } else if(secondChoice == 'N') {
                        System.exit(0);
                        break;
                    } else {
                        System.out.println("Invalid choice.");
                    }
                }
                break;
            case 3:
                System.out.println("Available balance :-  "+balance);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please enter a valid transaction.");
        }

    }
}
