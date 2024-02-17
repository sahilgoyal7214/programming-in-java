//Main.java
//Sahil Goyal
//AIML-B1
//2022-26
//22070126094
package Assignment_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of UserInput class to handle student operations
        UserInput user = new UserInput();
        
        // Display menu and handle user input in a loop
        while (true) {
            // Display menu options
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Update Student Name");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            // Read user choice
            int choice = sc.nextInt();

            // Process user choice using switch statement
            switch (choice) {
                case 1:
                    // Add a new student
                    user.addStudent();
                    break;
                case 2:
                    // Display all student details
                    System.out.println("Student Details:");
                    user.display();
                    break;
                case 3:
                    // Search for a student by PRN
                    System.out.println("Enter PRN to search:");
                    int prn = sc.nextInt();
                    int index = user.searchByPrn(prn);
                    if (index != -1) {
                        System.out.println("Student found at index " + index);          
                    }
                    else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    // Update student name by PRN
                    System.out.println("Enter PRN to update details:");
                    int prn1 = sc.nextInt();
                    user.updateName(prn1);
                    user.display();
                    break;
                case 5:
                    // Delete a student by PRN
                    System.out.println("Enter PRN to delete:");
                    int prn2 = sc.nextInt();
                    user.deleteStudent(prn2);
                    user.display();
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
