package week5day5_lamda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		try {
			FileInputStream fls =new  FileInputStream("Book.java");
			FileOutputStream fos = new FileOutputStream("copy.java");
			
			int input;
			while((input = fls.read()) != -1) {
				fos.write(input);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
