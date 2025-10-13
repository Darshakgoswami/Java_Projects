package File.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Simple_File 
{
	
	public static void main(String[] args) 
	{
		// ----------- CREATE FILE --------------
		try {
			FileOutputStream fout  = new FileOutputStream("example.txt");
			
			// WRITE DATA IN FILE
			String s = "Hello World !";
			fout.write(s.getBytes());
			
			// READ DATA FROM FILE
			FileInputStream fin = new FileInputStream("example.txt");
			/* while loop no use etle karyo because data hoy tya sudhi read karavana che, 
			and te data ne int-form ma aapse etle ene char ma convert karvanu che 
			etle ema (char)i lakhvanu che */
			
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			
			// MERGE 2 FILES DATA
			FileInputStream fin1 = new FileInputStream("example.txt");
			FileInputStream fin2 = new FileInputStream("student.txt");
			
			SequenceInputStream var = new SequenceInputStream(fin1,fin2);
			int i1=0;
			while((i1=var.read())!=-1)
			{
				System.out.print((char)i1);
			}
			
			/* SAME FILE MA DATA ADD KARI AE TO OLD DATA REMOVE KARE CHE AND NEW DATA NE UPDATE KARE CHE, 
			AAPDE OLA AND NEW BANE DATA RAKHVA HOY TO 'TRUE' KEYWORD LAKHVU.*/
			
			FileOutputStream fout1  = new FileOutputStream("example.txt",true);
			fout1 .write(" THIS IS CODING".getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}