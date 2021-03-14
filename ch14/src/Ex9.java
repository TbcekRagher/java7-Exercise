import java.util.Scanner;
import java.io.*;
public class Ex9
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
	//double num[ ] =new double [1000];
	FileWriter fw = new FileWriter("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\3q.txt");
	BufferedWriter bufw = new BufferedWriter(fw);
	for(int i =0;i<10;i++)
	{
		bufw.write(Double.toString((int)(Math.random()*10000+1)));
		bufw.newLine();
	}
	bufw.flush();
	fw.close();
	}
}