package Final;
class Animal {
    final void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

// final method - cannot be overridden
class Dog extends Animal {
    // ❌ This would cause a compile-time error if uncommented
    /*
    void sound() {
        System.out.println("Dog barks");
    }
    */
}

public class Final_Method 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
        d.sound();
	}
}