package net.javacode;

import java.util.Scanner;

public class marklist {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int numberOfStudents = 4; 

		       
		        int[][] marks = new int[numberOfStudents][3];
		        int[] totalMarks = new int[numberOfStudents];
		        String[] names = new String[numberOfStudents];
		        String[] rollNumbers = new String[numberOfStudents];
		        String[] results = new String[numberOfStudents];
		        char[] grades = new char[numberOfStudents];

		        for (int i = 0; i < numberOfStudents; i++) {
		            System.out.print("Enter the Student Roll Number: ");
		            rollNumbers[i] = scanner.next();

		            System.out.print("Enter the student Name: ");
		            names[i] = scanner.next();

		            System.out.print("Enter the three marks: ");
		            for (int j = 0; j < 3; j++) {
		                marks[i][j] = scanner.nextInt();
		                totalMarks[i] += marks[i][j];
		            }

		           
		            results[i] = (marks[i][0] > 50 && marks[i][1] > 50 && marks[i][2] > 50) ? "P" : "F";
		            if (totalMarks[i] >= 70) {
		                grades[i] = 'A';
		            } else if (totalMarks[i] >= 50) {
		                grades[i] = 'B';
		            } else {
		                grades[i] = 'C';
		            }
		        }

		       
		        System.out.println("****************************************************************************************************************************");
		        System.out.println("                                     STUDENT MARKLIST");
		        System.out.println("****************************************************************************************************************************");
		        System.out.println("ROLL        NAME                MARK1              MARK2              MARK3      TOTAL          RESULT      Average    Grade");
		        for (int i = 0; i < numberOfStudents; i++) {
		            System.out.print(rollNumbers[i] + "           ");
		            System.out.print(names[i] + "            ");
		            System.out.print(marks[i][0] + "                  ");
		            System.out.print(marks[i][1] + "                  ");
		            System.out.print(marks[i][2] + "                  ");
		            System.out.print(totalMarks[i] + "                  ");
		            System.out.print(results[i] + "           ");
		            System.out.print((totalMarks[i] / 3.0) + "            ");
		            System.out.println(grades[i]);
		        }
		        
		       

	}
}
