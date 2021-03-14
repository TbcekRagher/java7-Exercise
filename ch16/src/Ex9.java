import java.util.*;
import java.io.*;
public class Ex9
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println();
		
		HashMap<Integer,Integer> hamp = new HashMap<Integer,Integer>(5);
		for(int i = 0;i<5;i++)
		{
			hamp.put(i,(int)(Math.random()*100+1));
		}
		System.out.println("5個小於100的整數: "+hamp);
		Collection<Integer> tr = hamp.values();
		System.out.println("5個小於100的整數under Collection tr: "+tr);
		
		Set<Integer> S =hamp.keySet();//將關鍵值轉成set模式  方便給Set的實作介面慘考
		System.out.println("5個小於100的整數under Set s: "+S);
		HashSet<Integer> f = new HashSet<Integer>(S);
		System.out.println("5個小於100的整數under HashSet f: "+f);
	}
}