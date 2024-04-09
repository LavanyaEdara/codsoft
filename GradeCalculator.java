
    
    
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Initialize variables for total grade and total weight
        double totalGrade = 0;
        double totalWeight = 0;
        
        // Loop through each subject to get grades and weights
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter the grade (0-100): ");
            double grade = scanner.nextDouble();
            System.out.print("Enter the weight (0-100): ");
            double weight = scanner.nextDouble();
            
            // Add the weighted grade to the total grade
            totalGrade += grade * (weight / 100);
            // Add the weight to the total weight
            totalWeight += weight;
        }
        
        // Calculate the average grade
        double averageGrade = totalGrade / totalWeight * 100;
        
        // Determine the letter grade based on the average grade
        String letterGrade;
        if (averageGrade >= 90) {
            letterGrade = "A";
        } else if (averageGrade >= 80) {
            letterGrade = "B";
        } else if (averageGrade >= 70) {
            letterGrade = "C";
        } else if (averageGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        // Display the average grade and letter grade
        System.out.println("\nAverage Grade: " + averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
        
        // Close the scanner
        scanner.close();
    }
}