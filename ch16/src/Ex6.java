import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Ex6
{ //* LinkedList 是實作 List介面 
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println()
		LinkedList <Integer> list = new LinkedList<Integer>();
		 int random[] = new int[10];
		 for(int i =0 ; i <10;i++)
		 {
			 random[i] = (int)(Math.random()*100+1);
			 list.add(random[i]);
		 }
		System.out.println("first: "+list.getFirst());
		System.out.println("last: "+list.getLast());
		System.out.println(list.getFirst()*list.getLast());
		 
	}
}