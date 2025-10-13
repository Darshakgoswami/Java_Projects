// SERIALIZATION MEANS OBJECT NE BYTE STREAM MA CONVERT KARESE.
// MEANS BYTE CODE AAPSE

package File.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Student class implements Serializable to allow serialization
class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialization_Concept {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Creating a student object
        Student student = new Student(1, "John Doe");

        // --- Serialization ---
        FileOutputStream fout = new FileOutputStream("student.txt");
        ObjectOutputStream o = new ObjectOutputStream(fout);
        o.writeObject(student);
        o.close();
        fout.close();

        // --- Deserialization ---
        FileInputStream fin = new FileInputStream("student.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Student s = (Student) in.readObject();
        in.close();
        fin.close();

        // Output the deserialized object data
        System.out.println(s.id + " " + s.name);
    }
}
