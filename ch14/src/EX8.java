import java.util.Scanner;
import java.io.*;
public class EX8
{//殺了我吧這城市很靠杯
	public static void main(String args[])throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		FileReader ok = new FileReader("C:\\Users\\YQQ\\Desktop\\bbb.txt");
		FileWriter over = new FileWriter("C:\\\\Users\\YQQ\\Desktop\\aaa.txt",true);
		
		char data [] = new char [50];
		ok.read(data);
		over.write(data);
		over.close();
		ok.close();
		FileWriter overW = new FileWriter("C:\\\\Users\\YQQ\\Desktop\\ccc.txt",true);
		BufferedWriter cc = new BufferedWriter(overW);//建立一個緩衝區  ,overW聯繫這個緩衝區
		FileReader fi= new FileReader("C:\\Users\\YQQ\\Desktop\\aaa.txt");
		//BufferedReader fi1 = new BufferedReader(fi);
		char data1[] = new char [1000];
		fi.read(data1);
		cc.write(data1,0,data1.length);
		cc.flush();
	cc.close();
	fi.close();
		
		
	}
}