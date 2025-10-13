package basic;

public class Abstract_Call extends Abstract_Class {

    void display() 
    {
        System.out.println("Display method from Concrete_Class");
    }

    public static void main(String[] args) 
    {
    	Abstract_Call obj = new Abstract_Call();
        obj.display();
    }
}