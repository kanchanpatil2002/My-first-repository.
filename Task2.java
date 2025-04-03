package codesoft;
import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Take input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine Grade
        char grade;
        if (averagePercentage >= 90)
        {
            grade = 'A';
        } 
        else if (averagePercentage >= 80)
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        } 
        else if (averagePercentage >= 60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();

	}

}
