package codesoft;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args)
	{
		
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int min = 1, max = 100;
	        int number = random.nextInt(max - min + 1) + min;
	        int attempts = 0, maxAttempts = 7; // Set max attempts
	        boolean guessedCorrectly = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between " + min + " and " + max + ".");

	        while (attempts < maxAttempts)
	        {
	            System.out.print("Enter your guess: ");
	            int guess = scanner.nextInt();
	            attempts++;

	            if (guess == number)
	            {
	                guessedCorrectly = true;
	                break;
	            }
	            else if (guess < number) 
	            {
	                System.out.println("Too low! Try again.");
	            } 
	            else
	            {
	                System.out.println("Too high! Try again.");
	            }
	        }

	        if (guessedCorrectly) 
	        {
	            System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	        } 
	        else 
	        {
	            System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + number);
	        }

	        scanner.close();
	    }

	}


