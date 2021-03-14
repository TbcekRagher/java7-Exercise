import java.util.Scanner;
import java.io.*;
public class Ex4
{
	public static void main(String args[])throws IOException
	{
		//Scanner  = new Scanner(System.in);
		FileReader over = new FileReader("C:\\Users\\YQQ\\Desktop\\k1.txt");
		System.out.println(over.read());
		
		char app[]=new char[35];
		over.read(app);
		String k = new String(app);
		System.out.println(k);
		over.close();
		
	}
}