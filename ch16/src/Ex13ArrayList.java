import java.util.*;
import java.io.*;
public class Ex13ArrayList
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for(int i= 0;i<10;i++)
		{
			alist.add((int)(Math.random()*100+1));
		}
		for(int s:alist)
		{
			System.out.println(s);
		}
		
	}
}