/* STATIC MEANS ENO OBJECT NAHI BANAVO PDE, STATIC VARIABLE NE DIRECT SYSTEM.OUT.PRINTLN MA LAKHI NE 
PRINT KARAVI SAKASE, AND STATIC METHOD NE DIRECT NAME THI PRINT KARAVI SAKASE, WITHOUT OBJECT*/

package Static;

public class First_Static {

    static int a = 10;
    int b = 20;

    public First_Static() {
        System.out.println(b);
    }

    static void demo() {
        System.out.println(a);
    }

    void demo1() {
        System.out.println(a + b);
    }

    static {
        System.out.println("before constructor");
    }

    {
        System.out.println("after static block");
    }

    public static void main(String[] args) {
        System.out.println(a);
        demo();
        new First_Static().demo1();
    }
}