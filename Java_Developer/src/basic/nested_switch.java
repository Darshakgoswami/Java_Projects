package basic;
import java.util.Scanner;
public class nested_switch {
public static void main(String[] args) {	
	String branch ;
	int semester;
	Scanner scn = new Scanner(System.in);
	System.out.println("enter branch");
	branch = scn.next();
	System.out.println("enter semester");
	semester = scn.nextInt();
	switch (branch) {	
	case "CSE": 		
		switch (semester) 
		{
		case 1:
			System.out.println("CSE 1st semester subjects: Mathematics, Physics, Chemistry");		
			break;
		case 2:
			System.out.println("CSE 2nd semester subjects: Data Structures, Computer Organization, Discrete Mathematics");			
			break;
		case 3:
			System.out.println("CSE 3rd semester subjects: Operating Systems, Database Management Systems, Software Engineering");
			break;
		default:
			System.out.println("Invalid semester for CSE");
			break;
			
		}
		break;
	case "IT":
		switch (semester) {
		case 1:
			System.out.println("" + "IT 1st semester subjects: Mathematics_IT, Physics_IT, Chemistry");
			
			break;
		case 2:
			System.out.println("IT 2nd semester subjects: Data Structures_IT, Computer Organization_It, Discrete Mathematics_IT");
			break;
		default:
			System.out.println("Invalid semester for IT");
			break;
		}		
	default:
		System.out.println("Invalid Branch");
		break;	
	}
	}
}
