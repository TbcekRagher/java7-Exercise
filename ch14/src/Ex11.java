import java.util.Scanner;
import java.io.*;
public class Ex11
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
//�u��B�zByte�t�C
	//FileInputStream over = new    FileInputStream("CUsersYQQDesktopjava__jdkch14\\Ex11���ɮ�.txt");    
	FileOutputStream overO = new FileOutputStream ("C:\\Users\\YQQ\\Desktop\\java__jdk\\Ex11���ɮ�.txt");
	//overO.(Double.toString(Math.random()));
			byte data[] = new byte[10000];
			for(int i = 0;i<10;i++)
			{	
				data[i] = (byte)(Math.random()*10000+1);
				System.out.println(data[i]);
			}
			overO.write(data);
			overO.close();
	}
}