import java.util.*;
import java.io.*;
public class Ex7
{
	public static void main(String args[]) throws IOException
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		LinkedList <String>f = new LinkedList<String>();
		f.add("apple");
		f.add("guava");
		
		ArrayList <String> alist = new ArrayList<String>();//把一個拿掉 就部會再換行了
		String line = "Think before you act.Full of    courtesy full of craft.\n"
				+ "Best is cheapest.\nLook before your     leap."
				+ "\nTake time when time comes.";
		//String splt[] = line.split("[.\n\\s+]");
		String splt[] = line.split("\\s+|\\n|\\.");
		System.out.println("ALL"+alist+"    "+alist.size());
		for(String ss:splt)
		{	
			System.out.print(ss);
			System.out.println();
			alist.add(ss);
		}
		System.out.println("ALL"+alist+"    "+'\n'+alist.size());
	}
}