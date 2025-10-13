package basic;

public class Polymorphism_Class {

	    void displayDetails(String name, int marks) {
	        System.out.println("Student Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade(marks)+ "\n");
	    }
	    
	    void displayDetails(String name, int marks, String subject) {
	        System.out.println("Student Name: " + name);
	        System.out.println("Marks: " + marks);
	        System.out.println("Grade: " + calculateGrade(marks)+"\n");
	    }

	    String calculateGrade(int marks) {
	        if (marks >= 90) return "A+";
	        else if (marks >= 75) return "A";
	        else if (marks >= 60) return "B";
	        else if (marks >= 50) return "C";
	        else return "F";
	    }

	    public static void main(String[] args) {
	    	Polymorphism_Class s = new Polymorphism_Class();

	        s.displayDetails("Alice", 85);
	        s.displayDetails("Bob", 67, "Math");
	        s.displayDetails("Charlie", 45);
	    }
}