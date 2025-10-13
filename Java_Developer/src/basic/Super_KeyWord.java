package basic;
class parent1
{
	int parent1_id;
	public parent1(int id)
	{
		System.out.println("parent1 id : "+id);
	}
}
class child1 extends parent1
{
	child1(int id)
	{
		super(80); // parent class ni property ne call karva mate super key-word no use thase 
		System.out.println("child1 : "+id);
	}
}
public class Super_KeyWord 
{
	public static void main(String[] args) {
		new child1(100);
	}
}