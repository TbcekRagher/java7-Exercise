import java.util.*;
import java.io.*;
public class ¥Ü½dTreeMapaAndIterator
{
	public static void main(String args[]) 
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println();
		TreeMap<Integer,String>  f = new TreeMap<Integer,String>();
		f.put(1,"qwe");
		f.put(2,"ewe");
		f.put(3,"ce");
		f.put(4,"ds");
		f.put(5,"AA");
		System.out.println("1 "+f.firstKey());
		System.out.println("2 "+f.lastKey());
		System.out.println("3 "+f.subMap(1, 3));
		System.out.println("4 "+f.tailMap(3));
		Set <Integer>h = f.keySet();
		Iterator<Integer> itr = h.iterator();
	int str ;
		while(itr.hasNext())
		{
			str = itr.next();
			System.out.println(" WWD"+str);
		}
	}
}