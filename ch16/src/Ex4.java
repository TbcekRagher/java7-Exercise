import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
public class Ex4
{
	public static void main(String args[]) 
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		HashSet<Integer> f = new HashSet<Integer>();
		f.add(65);
		f.add(29);
		f.add(18);
		f.add(34);
		TreeSet<Integer> f1 = new TreeSet<Integer>(f); 
		f1.add(97);
		f1.add(62);
		f1.add(97);
		f1.add(53);
		System.out.println("TreeSet:" +f1);
		int k  = f1.first()+f1.last();
		System.out.println("mean of first and last: "+k);
	/////////////////////////////////////////////////////////////////
		String line = "asd qweqwe wedfqwe gwe";
		
		String app[] = line.split("\\s+");
		for(String ss :app)
		{
			System.out.println(ss);//定義一個變數ss來印出分開後的東西		
		}
		{
			
		}
	}
}