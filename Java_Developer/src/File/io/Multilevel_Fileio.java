// HERE SERIALIZATION CONCEPT NE INHERITANCE CONCEPT SATHE USE KARYO CHE.

package File.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Base class
class Admin_class implements Serializable {
    int id;
    String name;

    public Admin_class(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// First subclass
class Sub_class_1 extends Admin_class {
    int sub_id;
    String sub_name;

    public Sub_class_1(int sub_id, String sub_name) {
        super(1, "test");
        this.sub_id = sub_id;
        this.sub_name = sub_name;
    }
}

// Second subclass (multilevel)
class grnad_child extends Sub_class_1 {
    int grand_c_id;
    String grand_c_name;

    public grnad_child(int grand_c_id, String grand_c_name) {
        super(2, "test2");
        this.grand_c_id = grand_c_id;
        this.grand_c_name = grand_c_name;
    }
}

// Main class
public class Multilevel_Fileio {
    public static void main(String[] args) {
        grnad_child sub = new grnad_child(3, "test_3");

        try {
            // Serialize the object
            FileOutputStream fout = new FileOutputStream("File_io.txt");
            ObjectOutputStream o1 = new ObjectOutputStream(fout);
            o1.writeObject(sub);
            o1.close();
            fout.close();

            // Deserialize the object
            FileInputStream fin = new FileInputStream("File_io.txt");
            ObjectInputStream o2 = new ObjectInputStream(fin);
            grnad_child g = (grnad_child) o2.readObject();
            o2.close();
            fin.close();

            // Print data from deserialized object
            System.out.println("id: " + g.id + ", name: " + g.name);
            System.out.println("sub_id: " + g.sub_id + ", sub_name: " + g.sub_name);
            System.out.println("grand_c_id: " + g.grand_c_id + ", grand_c_name: " + g.grand_c_name);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}