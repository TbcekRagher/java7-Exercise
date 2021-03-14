import java.util.*;
import java.io.*;
public class Ex15LinkedList
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		LinkedList<Integer> list= new LinkedList<Integer>();	
		for(int i= 0;i<10;i++)
		{
			list.add((int)(Math.random()*100+1));
		}
		for(int s:list)
		{
			System.out.println(s);
		}
		System.out.println("///////////////////");
		int k;
		ListIterator<Integer> Llist=  list.listIterator();
		while(Llist.hasNext())
		{
			k = Llist.next();
			System.out.println(k);
		}
		int i;
		System.out.println("///////////////////");
		ListIterator<Integer> klist=  list.listIterator(); // list.listIterator()指被用一次
		
		while(klist.hasPrevious())
		{
			i = klist.previous();
			System.out.println(i);
		}
		
	}
}