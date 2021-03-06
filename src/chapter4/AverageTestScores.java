package chapter4;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //initialize known variables
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //process all students
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for Test #" + (j + 1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + average);
        }

        scanner.close();
    }
}
