import java.util.*;
import java.io.*;
public class Ex14TreeSet
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		TreeSet<Integer> ts = new TreeSet<Integer>();	
		for(int i= 0;i<10;i++)
		{
			ts.add((int)(Math.random()*100+1));
		}
		for(int s:ts)
		{
			System.out.println(s);
		}
	}
}