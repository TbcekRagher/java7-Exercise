import java.util.*;
import java.io.*;
public class Ex11水果價目表
{
	public static void main(String args[])  
	{
		//Scanner ??? = new Scanner(System.in);
		//System.out.println();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		//System.out.println("How many kind of fruit?");
		//int number = scanner.nextInt();
		//int i = 0
		TreeMap<Integer,String> table = new TreeMap<Integer,String>();
	/*	while(i<number){table.put(scanner.nextInt(),scanner1.nextLine());     i++;}*/
		table.put(325,"apple");
		table.put(594,"cherry");
		table.put(37,"pineapple");
		table.put(158,"mango");
		System.out.println(table);
		System.out.println("the most cheap fruit in wang-wang store is "+table.get(table.firstKey()));
		System.out.println("the most expensive fruit in wang-wang store is "+table.get(table.lastKey()));
		System.out.println(table.lastKey()-table.firstKey());
		System.out.println(Integer.valueOf(table.lastKey())-Integer.valueOf(table.firstKey()));//要小心 很值得思考一下
	}
}