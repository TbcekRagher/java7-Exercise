import java.util.Scanner;
import java.io.*;
public class EX8
{//���F�ڧa�o�����ܾa�M
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
		BufferedWriter cc = new BufferedWriter(overW);//�إߤ@�ӽw�İ�  ,overW�pô�o�ӽw�İ�
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