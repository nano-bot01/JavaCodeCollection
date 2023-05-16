package programs;
import java.io.*;

public class file_handling_1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin =new FileInputStream("input.txt");
			FileOutputStream fout =new FileOutputStream("dit.txt");
			int c;
			
			while((c=fin.read())!=-1){
				fout.write(c);
			}
			fin.close();
			fout.close();
			
			
			
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
		
	}
}