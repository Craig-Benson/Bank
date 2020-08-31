package com.company;

import java.util.Scanner;

public class Bank {
    Scanner scan = new Scanner(System.in);
    int testPin = 1232;
    int pin;

    public void welcome(){
        System.out.println("Welcome to the Bank of Craig!");

    }

    public void promptPin(){
        System.out.println("Please enter your pin:");
        pin = scan.nextInt();
        checkPin();
    }

    public void checkPin(){

        if (pin == testPin){
            System.out.println("nice");
        }else{
            System.out.println("Wrong pin Aran!");
            promptPin();
        }
    }
}
