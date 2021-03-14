import java.util.*;
import java.io.*;
public class ¥Ü½dListIterator
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		LinkedList<Integer> f = new LinkedList<Integer>();
			for (int i =0;i<10;i++)
			{
				f.add((int)(Math.random()*100+1));
			}
			ListIterator<Integer> litr =	f.listIterator();
			int i =0;
			while(litr.hasNext())
			{ 	//next &previous ·|½Ä¬ð
				System.out.println( litr.nextIndex() +" "+litr.next());
				//System.out.println(litr.previousIndex() +""+ litr.previous());
			}
			f.set(5, 12002103);
	}
}