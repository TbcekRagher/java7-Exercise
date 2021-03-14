import java.util.*;
import java.io.*;
public class 示範TreeSet
{
	public static void main(String args[]) 
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
	TreeSet <Integer> f = new TreeSet<Integer>();
	for(int i =0;i<1000;i++)
	{
		f.add((int)(Math.random()*10000+1));
	}
	f.<Integer>first();
	System.out.println("f.<Integer>first():  "+f.<Integer>first());
	System.out.println("f.last(): "+f.<Integer>last());
	System.out.println("f.subSet(19, 31)"+f.<Integer>subSet(19, 31));
	System.out.println("大於8的"+f.<Integer>tailSet(31));//大於等於31的集合
	System.out.println("小於100的"+f.<Integer>headSet(100));//小於
	}
}	