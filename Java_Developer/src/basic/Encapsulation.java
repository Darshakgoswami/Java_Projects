// Encapsulation Meaning Data-Hiding, and protect it from outside interference/world

package basic;
public class Encapsulation {
	private int id;
	private String name, address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
	
	}
}