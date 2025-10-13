package File.io;



import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;



public class Read_Write_File {



	public Read_Write_File() throws IOException {

		// Constructor to initialize file reading/writing

		FileInputStream fin=new FileInputStream("test.txt"); // Open file input stream

 		int i;

 		System.out.println("Contents of the file:");

		while((i=fin.read())!=-1) { // Read until end of file

			System.out.print((char)i); // Print character

		}

		

		FileOutputStream fos = new FileOutputStream("test.txt", true); // Open file output stream in append mode

		String Data = "\nThis is appended data.";

		byte b[]=Data.getBytes(); // Convert string to byte array

		fos.write(b);

	}

	

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		new Read_Write_File();

	}



}