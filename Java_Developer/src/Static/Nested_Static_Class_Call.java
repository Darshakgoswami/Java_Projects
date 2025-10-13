// NORMAL CLASS NI ANDAR STATIC CLASS HOY TO ENE KAI RITE CALL KARVO, ENO PROGRAM CHE

package Static;

public class Nested_Static_Class_Call {

    // Nested static class
    static class Outer {
        static class static_class {
            void static_demo() {
                System.out.println("Static method");
            }

            static void static_demo1() {
                System.out.println("static 1 method");
            }
        }

        void outer_demo() {
            System.out.println("non static method");
        }
    }

    public static void main(String[] args) {
        // Call nested static class
        Outer.static_class o = new Outer.static_class();
        o.static_demo();        // Calls non-static method of static nested class
        o.static_demo1();       // Calls static method of static nested class

        // Call outer class non-static method
        Outer o1 = new Outer();
        o1.outer_demo();
    }
}