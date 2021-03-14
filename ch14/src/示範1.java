import java.io.*;
import java.util.Scanner;
public class ¥Ü½d1//¤ß¦n²Ö
{
		public static void main (String args[])throws IOException
		{
			Scanner over = new Scanner(System.in);
			char data[] = new char[128000];
			char ccD[] = new char[1280000];
			FileReader fr = new FileReader("C:\\Users\\YQQ\\eclipse\\java-2019-06\\eclipse\\hi.txt");
			int num = fr.read();
			int num1 = fr.read(data);
			//int num2 = fr.read(ccD,10,num);
			//fr.skip(12);
			String str = new String(data,0,num);
			System.out.println(num);
			System.out.println("Characters read "+str);
			fr.close();
			over.close();
		}
}
