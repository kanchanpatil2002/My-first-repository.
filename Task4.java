package codesoft;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class Task4
{
    static Scanner scanner = new Scanner(System.in);
    static int score = 0;
    static int questionIndex = 0;
    static boolean answered = false;
    static Timer timer;

    static String[][] questions = 
    	{
        {"What is the capital of France?", "A) Paris", "B) London", "C) Rome", "D) Berlin", "A"},
        {"Which language is used for Android development?", "A) Python", "B) Java", "C) Swift", "D) C++", "B"},
        {"What is 5 + 3?", "A) 6", "B) 7", "C) 8", "D) 9", "C"}
    };

    public static void main(String[] args) 
    {
        System.out.println("Welcome to the Quiz!");
        startQuiz();
        System.out.println("Quiz Over! Your final score is: " + score);
    }

    public static void startQuiz() 
    {
        for (questionIndex = 0; questionIndex < questions.length; questionIndex++)
        {
            askQuestion(questionIndex);
        }
    }

    public static void askQuestion(int index)
    {
        answered = false;
        System.out.println("\nQuestion " + (index + 1) + ": " + questions[index][0]);
        for (int i = 1; i <= 4; i++) {
            System.out.println(questions[index][i]);
        }

        // Timer of 10 seconds for each question
        timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                if (!answered)
                {
                    System.out.println("\nTime's up! Moving to the next question...");
                    timer.cancel();
                }
            }
        }, 10000);

        getUserAnswer(index);
    }

    public static void getUserAnswer(int index) 
    {
        System.out.print("Your answer: ");
        String userAnswer = scanner.next().toUpperCase();
        timer.cancel();  // Stop timer as user answered

        if (userAnswer.equals(questions[index][5]))
        {
            System.out.println("Correct!");
            score++;
        } 
        else 
        {
            System.out.println("Wrong! The correct answer was: " + questions[index][5]);
        }
        answered = true;
    }
}
