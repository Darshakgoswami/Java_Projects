package basic;

import java.io.*;

// Parent class
class Person {
    String name = "Darshak";
    int age = 20;
}

// Child class
class Studentx extends Person {
    int rollNo = 101;

    // Method to write data to file
    void writeData() {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Roll No: " + rollNo + "\n");
            fw.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Method to read data from file
    void readData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            System.out.println("Reading from file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Main class
public class Inheritance_With_File_Handling {
    public static void main(String[] args) {
        Studentx s = new Studentx();
        s.writeData();
        s.readData();
    }
}
