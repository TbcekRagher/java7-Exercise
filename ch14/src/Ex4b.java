import java.util.Scanner;
import java.io.*;
public class Ex4b
{
	public static void main(String args[])throws IOException
	{
		//Scanner  = new Scanner(System.in);
		FileReader over = new FileReader("C:\\Users\\YQQ\\Desktop\\k1.txt");
		System.out.println(over.read());
		//FileWriter overL = new FileWriter("C:\\Users\\YQQ\\Desktop\\k1.txt");
		
		char data[]=new char [100];
		
		over.skip(10);
		over.read(data);
		
		String app = new String(data);
		System.out.println(app);
		over.close();
		
	}
}