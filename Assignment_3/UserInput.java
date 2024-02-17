//UserInput.java
package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    // ArrayList to store Student objects
    ArrayList<Student> student = new ArrayList<Student>();

    // Method to add students to the ArrayList
    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ": ");
            String input = sc.nextLine();
            String[] details = input.split(" ");
            if (details.length >= 4) {
                // Extracting details from input and creating Student object
                int prn = Integer.parseInt(details[0]);
                String name = details[1];
                String dob = details[2];
                float marks = Float.parseFloat(details[3]);

                // Creating Student object and adding it to the ArrayList
                Student s = new Student(prn, name, dob, marks);
                student.add(s);
            } else {
                // Error message for invalid input format
                System.out.println("Invalid input format. Please enter details in the format: PRN Name DOB Marks");
                i--; // Decrementing the loop counter to re-enter the details
            }
        }
    }
    
    // Method to display details of all students
    public void display(){
        for(int i = 0; i < student.size(); i++){
            System.out.println(student.get(i).getPrn() + " " + student.get(i).getName() + " " + student.get(i).getDob() + " " + student.get(i).getMarks());
        }
    }

    // Method to search for a student by PRN
    public int searchByPrn(int prn){
        int index = -1;
        for(int i = 0; i < student.size(); i++){
            if(student.get(i).getPrn() == prn){
                index = i;
                break;
            }
        }
        return index;
    }

    // Method to update the name of a student by PRN
    public void updateName(int prn){
        int index = searchByPrn(prn);
        if(index != -1){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter new name: ");
            String name = sc.nextLine();
            student.get(index).setName(name);
            System.out.println("Name updated successfully");
        } 
        else {
            System.out.println("Student not found");
        }
    }

    // Method to delete a student by PRN
    public void deleteStudent(int prn){
        int index = searchByPrn(prn);
        if(index != -1){
            student.remove(index);
            System.out.println("Student deleted successfully");
        }
        else {
            System.out.println("Student not found");
        }
    }
}
