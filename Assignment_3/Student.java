// Student.java
package Assignment_3;

public class Student {
    // Private fields to store student information
    private int prn; // PRN
    private String name; // Name of the student
    private String dob; // Date of birth of the student
    private float marks; // Marks obtained by the student

    // Constructor to initialize the Student object
    Student(int prn, String name, String dob, float marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Setter method to set the PRN
    public void setPrn(int prn) {
        this.prn = prn;
    }

    // Getter method to get the PRN
    public int getPrn() {
        return prn;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the name
    public String getName() {
        return name;
    }

    // Setter method to set the date of birth
    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter method to get the date of birth
    public String getDob() {
        return dob;
    }

    // Setter method to set the marks
    public void setMarks(float marks) {
        this.marks = marks;
    }

    // Getter method to get the marks
    public float getMarks() {
        return marks;
    }
}
