package DSA;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection_Framework 
{
public Collection_Framework() 
{
ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(12);
a1.add(121);
a1.add(122);
a1.add(123);
a1.add(124);
a1.add(125);

//a1.addFirst(850);
//a1.addLast(960);
//a1.removeFirst();
//a1.removeLast();

//a1.remove(0);

// INDEX FIND KARYO "121" NO.
//System.out.println(a1.indexOf(121));

// INDEX 1 PAR VALUE 1000 UPDATE KARI
// a1.set(1, 1000);

// INDEX '0' PAR CHE ENE REMOVE KARYU.
// System.out.println("removed :"+a1.remove(0));

Iterator<Integer> i=a1.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}
}

public static void main(String[] args) 
{
	new Collection_Framework();
}		
}