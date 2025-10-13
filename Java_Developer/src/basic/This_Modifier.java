package basic;

public class This_Modifier {
	int id;
    String name;

    // Constructor
    This_Modifier(int id, String name) {
        this.id = id;         // this refers to instance variable
        this.name = name;     // this refers to instance variable
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
    }

	public static void main(String[] args) {
		This_Modifier s1 = new This_Modifier(101, "Darshak");
        s1.display();
	}
}