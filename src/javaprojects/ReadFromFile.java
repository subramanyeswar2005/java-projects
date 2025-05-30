package javaprojects;
import java.io.*;

public class ReadFromFile {
	public static void main(String[]args) {
		try {
			FileReader reader=new FileReader("D:\\3378");
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.println((char)ch);
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("Error:"+ e.getMessage());
		}
	}

}
