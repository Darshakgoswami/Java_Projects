package basic;

public class Display_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Darshak");
        s1.setRollNo(101);
        s1.setMarks(78);

        System.out.println("Name is : " + s1.getName());
        System.out.println("Roll number is : " + s1.getRollNo());
        System.out.println("Marks is : " + s1.getMarks());
        System.out.println("Grade is : " + s1.getGrade()); 
    }
}