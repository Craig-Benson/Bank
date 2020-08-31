package com.company;

import java.util.Scanner;

public class Bank {
    private Scanner scan = new Scanner(System.in);
    private int testPin = 1232;
    private String userInput;

    public void welcome(){
        System.out.println("Welcome to the Bank of Craig!");

    }

    public void promptPin(){
        System.out.println("Please enter your pin:");
        getUserInput();
        checkPin();
    }

    public void checkPin(){

        if (userInput.equals(String.valueOf(testPin))){
            openMenu();

        }else{
            System.out.println("Wrong pin Aran!");
            promptPin();
        }
    }

    private void openMenu() {
        displayMenu();
        getUserInput();
        menuChoice(userInput);

    }

    private void displayMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");
    }

    private void getUserInput() {

        userInput = scan.nextLine();
    }

    private void menuChoice(String userInput) {
        switch (Integer.parseInt(userInput)){

            case 1:
                System.out.println("deposit");
                break;

            case 2:
                System.out.println("withdraw");
                break;

            case 3:
                System.out.println("balance");
                break;

            default:
                System.out.println("exit");
                break;
        }
    }
}
