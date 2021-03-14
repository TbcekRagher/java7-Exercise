import java.util.Scanner;
import java.io.*;
public class Ex7
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		FileReader over =new FileReader("C:\\Users\\YQQ\\Desktop\\k1.txt");
		BufferedReader overR = new BufferedReader(over);
		String str;
		while((str = overR.readLine())!=null)
		{
			if(str.equals("看到她我就心動"))
			{	
				System.out.println("ERROR");
				continue;
			}
			System.out.println(str);
		}
		overR.close();
	}
}