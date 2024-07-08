package com.company;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Random rm = new Random();
        int randomNumber = rm.nextInt(100)+1;
        //System.out.println(randomNumber);

        Scanner sc = new Scanner(System.in);
        int guessNumber = 0;

        System.out.println("I have picked a number from 1 to 100. Now it's your challenge to guess that number.");

        while(randomNumber!=guessNumber){
            System.out.print("Enter your guess - ");
            guessNumber = sc.nextInt();
            if(randomNumber==guessNumber){
                System.out.println("Yayyy !!! Congratulations your guess is correct.");
            }else if(guessNumber > randomNumber){
                System.out.println("Your guessed number is high");
            }else{
                System.out.println("Your guessed number is low");
            }
        }
    }
}
