package File.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_Output_Stream {
	public File_Output_Stream()
	{
		// try (FileOutputStream fout = new FileOutputStream("test.txt"))
		try
		{
			/*String s = "welcome to java world !";
			byte b[]=s.getBytes();
			fout.write(b);*/
			
			FileInputStream fin = new FileInputStream("test.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new File_Output_Stream();
	}

}