import java.util.Scanner;
import java.io.*;
public class Ex6
{
	public static void main(String args[]) 
	{
		Scanner over = new Scanner(System.in);
		//System.out.println()
		int a = over.nextInt();
		int b = over.nextInt();
		Add a1 = new Add(a);
		Add a2 = new Add(b);
		Thread b1 = new Thread(a1);  //用runnable 介面實作 在class宣告玩第一波後
		Thread b2 = new Thread(a2);  //還要宣告Thread物件來接受 那個class的物件來進行多執行續
		b1.start();
		b2.start();
	}
}
class  Add implements Runnable
{
	private int n;
	private int sum = 0;
	public  Add(int a)
	{
		n = a;
	}
	public int adding(int n)
	{ 	if(n==0)return 0;
		return n+adding(n-1);
	}
	public void run()
	{
		System.out.println(adding(n));
	}
}